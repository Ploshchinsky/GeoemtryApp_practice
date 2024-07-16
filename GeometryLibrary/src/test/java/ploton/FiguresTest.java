package ploton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ploton.entity.Figures;

import java.util.Arrays;

public class FiguresTest {
    //Тесты для четырехугольников
    @Test
    public void rectangleTest() {
        double[] sides = {2, 4, 2, 4};
        double[] sides2 = {5, 5, 5, 5};
        Figures rectangle = FiguresFactory.getRectangle(sides);
        Figures square = FiguresFactory.getRectangle(sides2);

        double[] expected = {8, 12, 25, 20};
        double[] actual = {rectangle.getArea(), rectangle.getPerimeter(), square.getArea(), square.getPerimeter()};

        System.out.println(rectangle.getInfo());
        System.out.println(square.getInfo());

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    //Тест для треугольников
    @Test
    public void triangleTest() {
        double[] sides1 = {3, 8, 10};
        double[] sides2 = {9, 9, 9};
        Figures triangle = FiguresFactory.getTriangle(sides1);
        Figures isosceles = FiguresFactory.getTriangle(sides2);

        double[] expected = {9.921567416492215, 21.0, 35.074028853269766, 27.0};
        double[] actual = {triangle.getArea(), triangle.getPerimeter(), isosceles.getArea(), isosceles.getPerimeter()};

        System.out.println(triangle.getInfo());
        System.out.println(isosceles.getInfo());

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    //Тесты для круга
    @Test
    public void circleTest() {
        double radius = 5.0;
        Figures circle = FiguresFactory.getCircle(radius);

        double[] expected = {78.53981633974483, 31.41592653589793};
        double[] actual = {circle.getArea(), circle.getPerimeter()};

        System.out.println(circle.getInfo());

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void getInputParams_MethodTest() {
        double[] sides = {2, 4, 2, 4};
        double[] sides2 = {5, 5, 5};
        Figures rectangle = FiguresFactory.getRectangle(sides);
        Figures triangle = FiguresFactory.getTriangle(sides2);
        Figures circe = FiguresFactory.getCircle(15);

        System.out.println(rectangle.getInputParams());
        System.out.println(triangle.getInputParams());
        System.out.println(circe.getInputParams());
    }
}

