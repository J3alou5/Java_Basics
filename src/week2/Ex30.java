package week2;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }
}
