package week3_GUI;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String readWord = reader.nextLine();
        System.out.print("Length of the first part: ");
        int number = Integer.parseInt(reader.nextLine());
        String firstPart = readWord.substring(0, number);
        System.out.print(firstPart);
    }
}
