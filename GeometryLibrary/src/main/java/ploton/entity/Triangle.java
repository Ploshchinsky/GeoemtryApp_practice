package ploton.entity;

import ploton.FigureType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Triangle extends Figures {
    private double[] sides;

    public Triangle(FigureType figureType, double[] sides) {
        super(figureType);
        if (isIsosceles(sides)) {
            this.setFigureType(FigureType.ISOSCELES);
        }
        this.sides = sides;
    }

    @Override
    public double getPerimeter() {
        return Arrays.stream(sides).reduce(Double::sum).orElse(0);
    }

    @Override
    public double getArea() {
        double s = 1;
        double halfPerimeter = halfPerimeter();
        for (int i = 0; i < sides.length; i++) {
            s *= halfPerimeter - sides[i];
        }
        return Math.sqrt(halfPerimeter * s);
    }

    private double halfPerimeter() {
        return getPerimeter() / 2;
    }

    private boolean isIsosceles(double[] sides) {
        return Arrays.stream(sides).distinct().count() == 1;
    }

    @Override
    public String getInputParams() {
        return "Input Params: " + Arrays.stream(sides).boxed().toList().toString();
    }
}
