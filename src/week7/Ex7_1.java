package week7;

import java.util.Scanner;

public class Ex7_1 {
    private Scanner reader;
    private Ex7 dictionary;

    public Ex7_1(Scanner reader, Ex7 dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    // Start the user interface
    public void start() {
        while (true) {
            System.out.print("Statement: ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    // Add a new word pair to the dictionary
    private void add() {
        System.out.print("In Finnish: ");
        String finnishWord = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(finnishWord, translation);
    }

    // Translate a word and print the translation
    private void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        String translation = dictionary.translate(word);
        if (translation == null) {
            System.out.println("Word not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Ex7 dictionary = new Ex7();

        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        Ex7_1 ui = new Ex7_1(reader, dictionary);
        ui.start();
    }
}