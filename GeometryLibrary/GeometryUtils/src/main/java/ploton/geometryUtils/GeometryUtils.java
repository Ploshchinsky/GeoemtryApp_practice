package ploton.geometryUtils;

import ploton.entity.Figures;

public class GeometryUtils {
    public static boolean compare(Figures figure1, Figures figure2) {
        return figure1.getInputParams().equals(figure2.getInputParams());
    }

    public static boolean isSameType(Figures figure1, Figures figure2) {
        return figure1.getFigureType() == figure2.getFigureType();
    }
}
