package week10;

import java.util.Collection;

public abstract class Ex32 {

    public abstract void add(Ex32_1 thing);

    public void add(Collection<Ex32_1> things) {
        for (Ex32_1 thing : things) {
            add(thing);
        }
    }

    public abstract boolean isInTheBox(Ex32_1 thing);
}
