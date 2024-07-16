package ploton.geometryUtils;

import java.util.Map;

public class Cube extends Figures3D {
    public Cube(Map<Double, Double> vertexes) {
        super(vertexes);
    }

    @Override
    public String getInfo() {
        return "It's a Cube!";
    }

    @Override
    public String getArea() {
        return "Cube area = {MOCK}";
    }
}
