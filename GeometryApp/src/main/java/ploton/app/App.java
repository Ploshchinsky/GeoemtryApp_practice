package ploton.app;


import ploton.FiguresFactory;
import ploton.entity.Figures;
import ploton.geometryUtils.*;

import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Figures rectangle = FiguresFactory.getRectangle(new double[]{15, 22, 15, 22});
        Figures triangle = FiguresFactory.getTriangle(new double[]{9, 15, 19});
        Figures circle = FiguresFactory.getCircle(13);

        //v1.0.0
        System.out.println("1.0.0");
        System.out.println(rectangle.getInfo());
        System.out.println(triangle.getInfo());
        System.out.println(circle.getInfo());

        //1.1.0
        System.out.println("\n1.1.0");
        System.out.println(rectangle.getInputParams());
        System.out.println(triangle.getInputParams());
        System.out.println(circle.getInputParams());
        System.out.println(Figures.aboutClass());

        //GeometryLibrary + GeometryUtils 1.0.0
        System.out.println("\nGeometryLibrary + GeometryUtils 1.0.0");
        Figures rectangle2 = FiguresFactory.getRectangle(new double[]{15, 22, 15, 21});
        Figures rectangle3 = FiguresFactory.getRectangle(new double[]{15, 22, 15, 22});
        System.out.println("Rectangle1 compare to Rectangle 2 = " + GeometryUtils.compare(rectangle, rectangle2));
        System.out.println("Rectangle1 compare to Rectangle 2 = " + GeometryUtils.compare(rectangle, rectangle3));
        System.out.println("Circle compare to Triangle = " + GeometryUtils.compare(circle, triangle));

        //GeometryUtils 1.1.0
        System.out.println("\nGeometryUtils 1.1.0");
        System.out.println("Rectangle1 is same type to Rectangle 2 = " + GeometryUtils.isSameType(rectangle, rectangle2));
        System.out.println("Circle is same type to Triangle = " + GeometryUtils.isSameType(circle, triangle));

        //ThreeDimensionalShapes v.1.0.0
        System.out.println("\nThreeDimensionalShapes v.1.0.0");
        Figures3D cube = new Cube(Map.of(4.0, 2.0, 3.0, 3.0, 1.0, 4.0, 2.0, 3.0));
        Figures3D sphere = new Sphere(Map.of(4.0, 2.0, 3.0, 3.0, 1.0, 4.0, 2.0, 3.0));
        Figures3D pyramid = new Pyramid(Map.of(4.0, 2.0, 3.0, 3.0, 1.0, 4.0, 2.0, 3.0));
        System.out.println(cube.getInfo());
        System.out.println(sphere.getInfo());
        System.out.println(pyramid.getInfo());

        //ThreeDimensionalShapes v.1.1.0
        System.out.println("\nThreeDimensionalShapes v.1.1.0");
        System.out.println(cube.getArea());
        System.out.println(sphere.getArea());
        System.out.println(pyramid.getArea());
    }
}
