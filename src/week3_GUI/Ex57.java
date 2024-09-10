package week3_GUI;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String input;
        while (true) {
            System.out.print("Enter a string (or press Enter to finish): ");
            input = reader.nextLine();

            if (input.isEmpty()) {
                break;
            }

            list.add(input);
        }
        String[] array = list.toArray(new String[0]);
        System.out.println("You entered the following strings:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
