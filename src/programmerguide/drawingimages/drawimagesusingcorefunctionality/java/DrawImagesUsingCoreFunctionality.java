/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Imaging. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmerguide.drawingimages.drawimagesusingcorefunctionality.java;

import com.aspose.imaging.RasterImage;

public class DrawImagesUsingCoreFunctionality
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmerguide/drawingimages/drawimagesusingcorefunctionality/data/";

        //Create an instance of BmpCreateOptions and set its various properties
        com.aspose.imaging.imageoptions.BmpOptions createOptions = new com.aspose.imaging.imageoptions.BmpOptions();
        createOptions.setBitsPerPixel(24);

        //Create an instance of FileCreateSource and assign it to Source property
        createOptions.setSource(new com.aspose.imaging.sources.FileCreateSource(dataDir + "sample.bmp",false));

        //Create an instance of RasterImage
        RasterImage rasterImage = (RasterImage) RasterImage.create(createOptions, 500, 500);

        //Get the pixels of the image by specifying the area as image boundary
        com.aspose.imaging.Color [] pixels = rasterImage.loadPixels(rasterImage.getBounds());

        for (int index = 0; index < pixels.length; index++)
        {
            //Set the indexed pixel color to yellow
            pixels[index] =  com.aspose.imaging.Color.getYellow();
        }
        rasterImage.savePixels(rasterImage.getBounds(), pixels);

        // Save processed image.
        rasterImage.save();

        // Display Status.
        System.out.println("Processing completed successfully!");
    }
}




