import java.util.*;
/**
 * Created by Liho on 31.08.2016.
 */
public class Start {

    public static void main(String[] args) {
        UniverseManager universeManager = new UniverseManager();
        for (int ix = 0; ix < 1000; ++ix){
            if((ix % 2) == 0){
                universeManager.addCelestialObject(new Star(ix, "Star-" + ix));
            }else{
                universeManager.addCelestialObject(new Planet(ix, "Planet-" + ix));
            }
        }

        // ...

        for (int ix = 0; ix < 10; ++ix){
            universeManager.getCelestialObject(ix).render();
        }

    }

}
