/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Imaging. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmerguide.exportingimages.exportimagetopsd.java;

import com.aspose.imaging.fileformats.psd.ColorModes;
import com.aspose.imaging.fileformats.psd.CompressionMethod;
//import com.aspose.imaging.saveoptions.*;

public class ExportImageToPSD
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmerguide/exportingimages/exportimagetopsd/data/";

        //Load an existing image
        com.aspose.imaging.Image image = com.aspose.imaging.Image.load(dataDir + "sample.bmp");

        //Create an instance of PsdSaveOptions class
        //Create an instance of PsdSaveOptions class
        com.aspose.imaging.imageoptions.PsdOptions saveOptions = new com.aspose.imaging.imageoptions.PsdOptions();

        //Set the CompressionMethod as Raw
        //Note: Other supported CompressionMethod is CompressionMethod.Rle [No Compression]
        saveOptions.setCompressionMethod(CompressionMethod.Raw);

        //Set the ColorMode to GrayScale//Note: Other supported ColorModes are ColorModes.Bitmap and ColorModes.RGB
        saveOptions.setColorMode(ColorModes.RGB);

        //Save the image to disk location with supplied PsdOptions settings
        image.save(dataDir + "output.psd", saveOptions);

        // Display Status.
        System.out.println("Image exported to PSD successfully!");
    }
}




