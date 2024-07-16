package ploton.geometryUtils;

import java.util.Map;

public abstract class Figures3D {
    private Map<Double, Double> vertexes;

    public Figures3D(Map<Double, Double> vertexes) {
        this.vertexes = vertexes;
    }

    public abstract String getInfo();

    public abstract String getArea();
}
