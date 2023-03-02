package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class ShapeMain {
    public void Shapemain() {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        try {
            double[] shapeDimensions = new double[3];

            l.info("Enter the type of shape");
            String shapeType = sc.next();

            for (int i = 0; i < 3; i++) {
                String e = "Enter the "+ i +"value";
                l.info(e);
                shapeDimensions[i] = sc.nextInt();
            }

            Shape s1 = new Shape(shapeType, shapeDimensions);

            l.info("Area is " + s1.getArea());
            l.info("Perimeter is" + s1.getPerimeter());
        }
        catch(Exception e){
            l.info("error");
        }
    }
}
