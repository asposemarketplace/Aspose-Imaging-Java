/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Imaging. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmerguide.drawingimages.drawimagesusingadvancedfunctionality.drawingusinggraphicspath.java;

import com.aspose.imaging.*;

public class DrawingUsingGraphicsPath
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmerguide/drawingimages/drawimagesusingadvancedfunctionality/drawingusinggraphicspath/data/";

        //Create an instance of BmpCreateOptions and set its various properties
        com.aspose.imaging.imageoptions.BmpOptions createOptions = new com.aspose.imaging.imageoptions.BmpOptions();
        createOptions.setBitsPerPixel(24);

        //Create an instance of FileCreateSource and assign it to Source property
        createOptions.setSource(new com.aspose.imaging.sources.FileCreateSource(dataDir + "sample.bmp",false));

        //Create an instance of Image
        com.aspose.imaging.Image image = com.aspose.imaging.Image.create(createOptions,500,500);

        //Create and initialize an instance of Graphics
        com.aspose.imaging.Graphics graphics = new  com.aspose.imaging.Graphics(image);

        //Clear the image surface with white color
        graphics.clear(Color.getWhite());

        //Create an instance of GraphicsPath
        com.aspose.imaging.GraphicsPath graphicspath = new com.aspose.imaging.GraphicsPath();

        //Create an instance of Figure
        com.aspose.imaging.Figure figure = new com.aspose.imaging.Figure();

        //Add Arc shape to the figure by defining boundary Rectangle
        figure.addShape(new com.aspose.imaging.shapes.ArcShape(new RectangleF(10, 10, 300, 300), 0, 45));

        //Add Arc Polygon shape to the figure by defining boundary Rectangle
        figure.addShape(new com.aspose.imaging.shapes.PolygonShape(new PointF[]{new PointF(150, 10), new PointF(150, 200), new PointF(250, 300), new PointF(350, 400)}, true));

        //Add Arc Polygon shape to the figure by defining boundary Rectangle
        figure.addShape(new com.aspose.imaging.shapes.RectangleShape(new RectangleF(new PointF(250, 250), new SizeF(200, 200))));

        //Add figures to the GraphicsPath object
        graphicspath.addFigures(new Figure[]{ figure});

        //Draw Path
        graphics.drawPath(new Pen(com.aspose.imaging.Color.getBlack(), 2), graphicspath);

        //Create an instance of HatchBrush and set its properties
        com.aspose.imaging.brushes.HatchBrush hatchbrush = new  com.aspose.imaging.brushes.HatchBrush();
        hatchbrush.setBackgroundColor( com.aspose.imaging.Color.getBrown()); hatchbrush.setForegroundColor ( com.aspose.imaging.Color.getBlue());
        hatchbrush.setHatchStyle (HatchStyle.Vertical);

        //Fill path by supplying the brush and GraphicsPath objects
        graphics.fillPath(hatchbrush, graphicspath);

        // Save the final image.
        image.save();

        // Display Status.
        System.out.println("Processing completed successfully!");
    }
}




