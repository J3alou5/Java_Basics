package week10;

import java.util.HashSet;
import java.util.Set;

public class Ex32_3 extends Ex32 {
    private Set<Ex32_1> things;

    public Ex32_3() {
        this.things = new HashSet<>();
    }

    @Override
    public void add(Ex32_1 thing) {
        if (things.isEmpty()) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Ex32_1 thing) {
        return things.contains(thing);
    }
}
