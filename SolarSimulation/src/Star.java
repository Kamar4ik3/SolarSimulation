/**
 * Created by Liho on 31.08.2016.
 */
public class Star extends CelestialObject{

    /**
     * 
     * @param mass
     * @param name
     */
    public Star(double mass, String name) {
        super(mass, name);
    }

    @Override
    public void render() {
        System.out.println("<" + this.name + ">");
    }
}
