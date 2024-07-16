package ploton;

import ploton.entity.Circle;
import ploton.entity.Figures;
import ploton.entity.Rectangle;
import ploton.entity.Triangle;

public class FiguresFactory {
    public static Figures getRectangle(double[] sides) {
        if (!isRectangle(sides)) {
            return null;
        }
        return new Rectangle(FigureType.RECTANGLE, sides);
    }

    public static Figures getCircle(double radius) {
        return new Circle(FigureType.CIRCLE, radius);
    }

    public static Figures getTriangle(double[] sides) {
        if (!isTriangle(sides)) {
            return null;
        }
        return new Triangle(FigureType.TRIANGLE, sides);
    }

    private static boolean isRectangle(double[] sides) {
        if (sides.length != 4) {
            System.out.println("Error. Rectangle have only 4 sides!");
            return false;
        }
        return true;
    }

    private static boolean isTriangle(double[] sides) {
        if (sides.length != 3) {
            System.out.println("Error. Triangle have only 3 sides!");
            return false;
        }
        return true;
    }
}
