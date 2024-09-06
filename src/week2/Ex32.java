package week2;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = reader.nextInt();
        int i = 0;
        int sum = 0;
        while ( i <= number - 1) {
            i++;
            sum += i ;
            System.out.println(sum);
        }
        System.out.println("Sum is " + sum);
    }
}
