package week4;

import java.util.ArrayList;

public class Ex70 {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }

    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();

        firstList.add(1);
        firstList.add(5);
        firstList.add(3);

        secondList.add(4);
        secondList.add(8);
        secondList.add(6);

        System.out.println("Before combining:");
        System.out.println("First list: " + firstList);
        System.out.println("Second list: " + secondList);

        combine(firstList, secondList);

        System.out.println("After combining:");
        System.out.println("First list: " + firstList); // [1, 2, 3, 4, 5, 6]
    }
}
