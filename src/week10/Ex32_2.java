package week10;

import java.util.HashSet;
import java.util.Set;

public class Ex32_2 extends Ex32 {
    private int maxWeight;
    private int currentWeight;
    private Set<Ex32_1> things;

    public Ex32_2(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.things = new HashSet<>();
    }

    @Override
    public void add(Ex32_1 thing) {
        if (thing.getWeight() + currentWeight <= maxWeight) {
            things.add(thing);
            currentWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Ex32_1 thing) {
        return things.contains(thing);
    }
}
