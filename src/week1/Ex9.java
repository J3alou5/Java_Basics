package week1;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());


        System.out.println("Division:" + number1 + "/" + number2 + "=" + (number1 / number2));
    }
}
