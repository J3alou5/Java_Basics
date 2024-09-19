package week9;

import java.util.ArrayList;
import java.util.List;

public class Ex18_3 {
    private int boxCapacity;

    public Ex18_3(int boxCapacity) {
        this.boxCapacity = boxCapacity;
    }

    public List<Ex18_2> packThings(List<Ex18> things) {
        List<Ex18_2> boxes = new ArrayList<>();
        Ex18_2 currentBox = new Ex18_2(boxCapacity);

        for (Ex18 thing : things) {
            if (!currentBox.addThing(thing)) {
                boxes.add(currentBox);
                currentBox = new Ex18_2(boxCapacity);
                currentBox.addThing(thing);
            }
        }
        boxes.add(currentBox);
        return boxes;
    }
}
