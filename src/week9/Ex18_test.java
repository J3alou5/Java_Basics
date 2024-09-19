package week9;

import java.util.ArrayList;
import java.util.List;

public class Ex18_test {
    public static void main(String[] args) {
        List<Ex18> things = new ArrayList<>();
        things.add(new Ex18_1("passport", 2));
        things.add(new Ex18_1("toothbrush", 1));
        things.add(new Ex18_1("book", 4));
        things.add(new Ex18_1("circular saw", 8));

        Ex18_3 packer = new Ex18_3(10);
        List<Ex18_2> boxes = packer.packThings(things);

        System.out.println("Number of boxes: " + boxes.size());
        for (Ex18_2 box : boxes) {
            System.out.println("  Things in the box: " + box.getVolume() + " dm^3");
        }
    }
}