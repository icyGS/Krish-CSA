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

abstract class ImageData {
    protected final String inDir = "images/"; // location of images
    protected final String outDir = "images/tmp/";  // location of created files
    protected String inFile;
    protected String resizedFile;
    protected String colorFile;
    protected String ext;   // extension of file
    protected long bytes;
    protected int width;
    protected int height;

    // get attributes of picture
    public ImageData(String name, String ext) {
        this.ext = ext;
        this.inFile = this.inDir + name + "." + ext;
        this.resizedFile = this.outDir + name + "." + ext;
        this.colorFile = this.outDir + name + "New" + ".png";
        this.setStats();
    }

    public ImageData(String image) {
        this(image, "png");
    }
   
    // An image contains metadata, namely size, width, and height
    public void setStats() {
        BufferedImage img;
        try {
            Path path = Paths.get(this.inFile);
            this.bytes = Files.size(path);
            img = ImageIO.read(new File(this.inFile));
            this.width = img.getWidth();
            this.height = img.getHeight();
        } catch (IOException e) {
        }
    }

    // Scale or reduce to "scale" percentage provided
    public void resize(int scale) {
        BufferedImage img = null;
        int width = (int) (this.width * (scale/100.0) + 0.5);
        int height = (int) (this.height * (scale/100.0) + 0.5);

        try {
            // read an image to BufferedImage for processing
            img = ImageIO.read(new File(this.inFile));  // set buffer of image data
            img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            return;
        }


        //ImageIO.write(convertToBufferedImage(resizedImg), this.ext, new File(resizedFile));

        
        this.inFile = this.resizedFile;  // use scaled file vs original file in Class
        this.setStats();
    }
    
    // Will be used later
    protected abstract void scale(/*String color*/); 
}