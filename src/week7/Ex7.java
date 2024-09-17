package week7;

import java.util.HashMap;
import java.util.ArrayList;

public class Ex7 {
    private HashMap<String, String> dictionary;

    public Ex7() {
        this.dictionary = new HashMap<>();
    }

    // Add a new word and translation
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }

    // Translate a word
    public String translate(String word) {
        return this.dictionary.getOrDefault(word, null);  // Return null if word not found
    }

    // Get the total number of words
    public int amountOfWords() {
        return this.dictionary.size();
    }

    // Return all translations as a list of strings in the form key = value
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for (String key : this.dictionary.keySet()) {
            list.add(key + " = " + this.dictionary.get(key));
        }
        return list;
    }
}
