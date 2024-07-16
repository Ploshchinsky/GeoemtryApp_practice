package ploton.entity;

import ploton.FigureType;

public abstract class Figures {
    private FigureType figureType;

    public Figures(FigureType figureType) {
        this.figureType = figureType;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public FigureType getFigureType() {
        return figureType;
    }

    public void setFigureType(FigureType figureType) {
        this.figureType = figureType;
    }

    public String getInfo() {
        return "Figure[" + figureType + "] - Area: " + getArea() + " - Perimeter: " + getPerimeter();
    }

    //v1.1.0
    public abstract String getInputParams();

    public static String aboutClass() {
        return "This abstract class for figures";
    }
}
