package week3_GUI;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String readName = reader.nextLine();
        if (readName.length() >= 3) {
        for (int i = 0; i < 3 && i < readName.length(); i++) {
            System.out.println(readName.charAt(i));
        }
        }
    }
}
