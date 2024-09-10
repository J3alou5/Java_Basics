package week3_GUI;

import java.util.Scanner;

public class Ex56 {
    public static String reverse(String text) {
        StringBuilder reversedText = new StringBuilder(text);
        return reversedText.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your string: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
