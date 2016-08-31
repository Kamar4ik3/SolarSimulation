/**
 * Created by Liho on 31.08.2016.
 */
public class Planet extends CelestialObject{

    public Planet(double mass, String name) {
        super(mass, name);
    }

    @Override
    public void render() {
        System.out.println("(" + this.name + ")");
    }

    @Override
    public String toString(){
         return " Object Planet : mass=" + this.mass + " : name=" + this.name;
    }
}
