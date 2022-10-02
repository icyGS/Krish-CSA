package _notebooks;

import java.awt.Color;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.ImageIO;

public class GreenScale extends ImageData {
    
    public GreenScale(String name, String ext) {
        super(name, ext);
        this.colorFile = this.outDir + name + "Green" + ".png";
    }

    public GreenScale(String name) {
        super(name);
        this.colorFile = this.outDir + name + "Green" + ".png";
    }

    @Override
    protected void scale() {
        BufferedImage img = null;
        
        
        // Deletes previously named file if exists 
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
                Color col = new Color(img.getRGB(j, i));
                int rgb = new Color(0, col.getGreen(), 0).getRGB();
                img.setRGB(j, i, rgb);

            }
        }


        try {
            ImageIO.write(img, "png", new File(this.colorFile) );
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }

    public static void main(String[] args) {
        GreenScale BlueSunset = new GreenScale("BlueSunset", "png");
        BlueSunset.scale();
    }

}