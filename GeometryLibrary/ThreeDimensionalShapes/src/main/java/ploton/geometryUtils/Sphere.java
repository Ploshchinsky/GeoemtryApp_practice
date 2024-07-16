package ploton.geometryUtils;

import java.util.Map;

public class Sphere extends Figures3D{
    public Sphere(Map<Double, Double> vertexes) {
        super(vertexes);
    }

    @Override
    public String getInfo() {
        return "It's a Sphere!";
    }
    @Override
    public String getArea() {
        return "Sphere area = {MOCK}";
    }
}
