package ploton.geometryUtils;

import java.util.Map;

public class Pyramid extends Figures3D{
    public Pyramid(Map<Double, Double> vertexes) {
        super(vertexes);
    }

    @Override
    public String getInfo() {
        return "It's a Pyramid!";
    }
    @Override
    public String getArea() {
        return "Pyramid area = {MOCK}";
    }
}
