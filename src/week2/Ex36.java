package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a numbers: ");
        double sum = 0;
        double i = 1;
        int evenCount = 0;
        int oddCount = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read % 2 == 0) {
                evenCount = evenCount + 1;
            }
            if (read == -1) {
                break;
            }
            else if (read % 2 == 1) {
                oddCount = oddCount + 1;
            }
            sum += read;

            i++;
        }
        double count = i - 1;
        double avg = sum / count;
        System.out.println("Thank you see you later!");
        System.out.printf("The sum is %.0f%n", sum);
        System.out.printf("How many numbers: %.0f%n", count);
        System.out.println("The average is " + avg);
        System.out.println("Even numbers:" + evenCount);
        System.out.println("Odd numbers:" + oddCount);
    }
}
