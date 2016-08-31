import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liho on 31.08.2016.
 */
public class UniverseManager {

    private final List<ICelestialObject> celestialObjectList;

    /**
     *
     */
    public UniverseManager() {
        System.out.println("created: " + this.getClass().getName());
        this.celestialObjectList = new ArrayList();
    }

    /**
     *
     * @param obj
     */
    public void addCelestialObject(ICelestialObject obj){
        this.celestialObjectList.add(obj);
    }

    /**
     *
     * @param index
     * @return
     */
    public ICelestialObject getCelestialObject(int index){
        return this.celestialObjectList.get(index);
    }

}
