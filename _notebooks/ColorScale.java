package _notebooks;

import java.awt.Color;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.ImageIO;

public class ColorScale extends ImageData {
    
    public ColorScale(String name, String color, String ext) {
        super(name, ext);
        this.colorFile = this.outDir + name + color + ".png";
    }

    public ColorScale(String name, String color) {
        super(name, color);
        this.colorFile = this.outDir + name + color + ".png";
    }

    @Override
    protected void scale(String color) {
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
        if (color.equals("Red")){
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    Color col = new Color(img.getRGB(j, i));
                    int rgb = new Color(col.getRed(), 0, 0).getRGB();
                    img.setRGB(j, i, rgb);
                }
            }
        }

        if (color.equals("Blue")){
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    Color col = new Color(img.getRGB(j, i));
                    int rgb = new Color(0, 0, col.getBlue()).getRGB();
                    img.setRGB(j, i, rgb);
                }
            }
        }

        if (color.equals("Green)")){
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    Color col = new Color(img.getRGB(j, i));
                    int rgb = new Color(0, col.getGreen(), 0).getRGB();
                    img.setRGB(j, i, rgb);
    
                }
            }
        }



        try {
            ImageIO.write(img, "png", new File(this.colorFile) );
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }

    public static void main(String[] args) {
        ColorScale BlueSunset = new ColorScale("BlueSunset", "png");
        BlueSunset.scale("Red");
        BlueSunset.scale("Green");
        BlueSunset.scale("Blue");
    }

}