package org.example;

public class Shape {
    private String shapeType;
    private double[] shapeDimensions;

    public Shape(String shapeType, double[] shapeDimensions) {
        this.shapeType = shapeType;
        this.shapeDimensions = shapeDimensions;
    }

    public double getPerimeter() {
        double perimeter = 0;
        if (shapeType.equals("triangle")) {
            perimeter = shapeDimensions[0] + shapeDimensions[1] + shapeDimensions[2];
        } else if (shapeType.equals("rectangle")) {
            perimeter = 2 * (shapeDimensions[0] + shapeDimensions[1]);
        } else if (shapeType.equals("circle")) {
            perimeter = 2 * Math.PI * shapeDimensions[0];
        }
        return perimeter;
    }
    public double getArea() {
        double area = 0;
        if (shapeType.equals("triangle")) {
            double s = (shapeDimensions[0] + shapeDimensions[1] + shapeDimensions[2]) / 2;
            area = Math.sqrt(s * (s - shapeDimensions[0]) * (s - shapeDimensions[1]) * (s - shapeDimensions[2]));
        } else if (shapeType.equals("rectangle")) {
            area = shapeDimensions[0] * shapeDimensions[1];
        } else if (shapeType.equals("circle")) {
            area = Math.PI * shapeDimensions[0] * shapeDimensions[0];
        }
        return area;
    }

}


