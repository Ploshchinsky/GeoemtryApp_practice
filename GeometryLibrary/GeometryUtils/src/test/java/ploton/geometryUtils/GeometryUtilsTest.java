package ploton.geometryUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ploton.FiguresFactory;
import ploton.entity.Figures;

import java.util.ArrayList;
import java.util.List;

public class GeometryUtilsTest {
    @Test
    public void compare_methodTest() {
        List<Boolean> expected = List.of(false, true, false, false, false, false, false,
                true, false, false, false, false, false, true);
        List<Boolean> actual = new ArrayList<>();

        List<Figures> figuresList = getFigures();
        for (int i = 0; i < figuresList.size() - 2; i++) {
            Figures temp1 = figuresList.get(i);
            Figures temp2 = figuresList.get(i + 1);
            Figures temp3 = figuresList.get(i + 2);
            System.out.println(temp1.getInputParams() + " compare to " + temp2.getInputParams() + " = "
                    + GeometryUtils.compare(temp1, temp2));
            System.out.println(temp1.getInputParams() + " compare to " + temp3.getInputParams() + " = "
                    + GeometryUtils.compare(temp1, temp3));
            actual.add(GeometryUtils.compare(temp1, temp2));
            actual.add(GeometryUtils.compare(temp1, temp3));
            System.out.println();
        }
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    private static List<Figures> getFigures() {
        Figures triangle1 = FiguresFactory.getTriangle(new double[]{5, 14, 17});
        Figures triangle2 = FiguresFactory.getTriangle(new double[]{5, 17, 14});
        Figures triangle3 = FiguresFactory.getTriangle(new double[]{5, 14, 17});

        Figures circle1 = FiguresFactory.getCircle(15);
        Figures circle2 = FiguresFactory.getCircle(11);
        Figures circle3 = FiguresFactory.getCircle(15);

        Figures rectangle1 = FiguresFactory.getRectangle(new double[]{5, 8, 5, 8});
        Figures rectangle2 = FiguresFactory.getRectangle(new double[]{8, 5, 8, 5});
        Figures rectangle3 = FiguresFactory.getRectangle(new double[]{5, 8, 5, 8});

        List<Figures> figuresList = List.of(triangle1, triangle2, triangle3,
                rectangle1, rectangle2, rectangle3, circle1, circle2, circle3);
        return figuresList;
    }
}
