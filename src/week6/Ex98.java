package week6;

import java.util.Arrays;

public class Ex98 {

    // copy an array
    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length]; // Create a new array of the same size
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i]; // Copy
        }
        return copiedArray;
    }

    // reverse copy an array
    public static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i]; // reverse order
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};


        int[] copied = copy(original);
        copied[0] = 99;

        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));


        int[] reversed = reverseCopy(original);
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reversed));
    }
}

