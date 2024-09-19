package week9;

import java.util.ArrayList;
import java.util.List;

public class Ex18_2 implements Ex18 {
    private int maximumCapacity;
    private List<Ex18> things;

    public Ex18_2(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<>();
    }

    public boolean addThing(Ex18 thing) {
        if (thing.getVolume() + getVolume() <= maximumCapacity) {
            things.add(thing);
            return true;
        }
        return false;
    }

    public int getVolume() {
        int totalVolume = 0;
        for (Ex18 thing : things) {
            totalVolume += thing.getVolume();
        }
        return totalVolume;
    }

    @Override
    public String toString() {
        return "Box with volume: " + getVolume() + "/" + maximumCapacity;
    }
}
