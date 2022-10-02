package _notebooks;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Graphics2D;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.stream.ImageOutputStream;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;

public class GrayScale extends ImageData {
    public GrayScale(String name, String ext) {
        super(name, ext);
        this.colorFile = this.outDir + name + "Gray" + ".png";
    }

    public GrayScale(String name) {
        super(name);
        this.colorFile = this.outDir + name + "Gray" + ".png";
    }

    @Override
    protected void scale() {
        BufferedImage img = null;
        PrintWriter colorPrt = null;
        FileWriter colorWrt = null;
        
        
        // Just deletes file if already exists in tmp
        try {
            File file = new File(this.colorFile);
            Files.deleteIfExists(file.toPath()); 
        } catch (IOException e) {
            System.out.println("Delete File error: " + e);
        }


        try {
            img = ImageIO.read(new File(this.inFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                //Color col = new Color(img.getRGB(j, i));
                //int rgb = new Color((int)(0.299 * col.getRed()), (int)(0.114 * col.getGreen()), (int)(0.587 * col.getBlue())).getRGB();
                int rgb = img.getRGB(j, i);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = (rgb & 0xFF);

                // Normalize and gamma correct:
                float rr = (float) Math.pow(r / 255.0, 2.2);
                float gg = (float) Math.pow(g / 255.0, 2.2);
                float bb = (float) Math.pow(b / 255.0, 2.2);

                // Calculate luminance:
                float lum = (float) (0.2126 * rr + 0.7152 * gg + 0.0722 * bb);

                // Gamma compand and rescale to byte range:
                int grayLevel = (int) (255.0 * Math.pow(lum, 1.0 / 2.2));
                int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel; 
                img.setRGB(j, i, gray);


            }
        }
        // System.out.println("for loop done");

        try {
            ImageIO.write(img, "png", new File(this.colorFile) );
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }

    public static void main(String[] args) {
        GrayScale BlueSunset = new GrayScale("BlueSunset", "png");
        BlueSunset.scale();
    }

}