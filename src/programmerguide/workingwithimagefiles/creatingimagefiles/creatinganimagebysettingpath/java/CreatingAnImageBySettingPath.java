/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Imaging. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmerguide.workingwithimagefiles.creatingimagefiles.creatinganimagebysettingpath.java;

import com.aspose.imaging.*;

public class CreatingAnImageBySettingPath
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmerguide/workingwithimagefiles/creatingimagefiles/creatinganimagebysettingpath/data/";

        //Creates an instance of BmpOptions and set its various properties
        com.aspose.imaging.imageoptions.BmpOptions createOptions = new com.aspose.imaging.imageoptions.BmpOptions();

        createOptions.setBitsPerPixel(24);

        //Create an instance of FileCreateSource and assign it as Source for the instance of BmpOptions
        //If second parameter is not passed, then by default the file has IsTemporal set to True
        createOptions.setSource(new com.aspose.imaging.sources.FileCreateSource(dataDir + "sample.bmp"));

        //Creates an instance of Image
        com.aspose.imaging.Image image = com.aspose.imaging.Image.create(createOptions,500,500);

        image.save();

        // Display Status.
        System.out.println("Image created successfully!");
    }
}




