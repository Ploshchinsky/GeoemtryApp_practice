package ploton.entity;

import ploton.FigureType;

import java.util.Arrays;

public class Rectangle extends Figures {
    private double[] sides;

    public Rectangle(FigureType figureType, double[] sides) {
        super(figureType);
        if (isSquare(sides)) {
            this.setFigureType(FigureType.SQUARE);
        }
        this.sides = sides;
    }


    @Override
    public double getPerimeter() {
        return Arrays.stream(sides).reduce(Double::sum).orElse(0);
    }

    @Override
    public double getArea() {
        if (getFigureType() == FigureType.SQUARE) {
            return Math.pow(sides[0], 2);
        }
        return Arrays.stream(sides).distinct().reduce((first, second) -> first * second)
                .orElseThrow(IllegalArgumentException::new);
    }

    public boolean isSquare(double[] sides) {
        return Arrays.stream(sides).distinct().count() == 1;
    }

    @Override
    public String getInputParams() {
        return "Input Params: " + Arrays.stream(sides).boxed().toList().toString();
    }
}
