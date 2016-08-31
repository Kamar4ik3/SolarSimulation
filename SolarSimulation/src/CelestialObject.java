/**
 * Created by Liho on 31.08.2016.
 */
public abstract class CelestialObject implements ICelestialObject{

    protected double mass;

    protected String name;

    public CelestialObject(double mass, String name) {
        this.mass = mass;
        this.name = name;
    }
}
