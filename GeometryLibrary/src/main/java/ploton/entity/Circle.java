package ploton.entity;

import ploton.FigureType;

public class Circle extends Figures {
    private double radius;

    public Circle(FigureType figureType, double radius) {
        super(figureType);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * (Math.PI * radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getInputParams() {
        return "Input Params: " + radius;
    }
}
