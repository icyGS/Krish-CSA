package _notebooks;

import java.awt.Color;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.ImageIO;

public class RedScale extends ImageData {
    
    public RedScale(String name, String ext) {
        super(name, ext);
        this.colorFile = this.outDir + name + "Red" + ".png";
    }

    public RedScale(String name) {
        super(name);
        this.colorFile = this.outDir + name + "Red" + ".png";
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
                int rgb = new Color(col.getRed(), 0, 0).getRGB();
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
        RedScale BlueSunset = new RedScale("BlueSunset", "png");
        BlueSunset.scale();
    }

}