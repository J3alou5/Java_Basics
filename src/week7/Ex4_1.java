package week7;

import java.util.ArrayList;

class Ex4_1 {  // Class Thing is now Ex4_1
    private String name;
    private int weight;

    // Constructor
    public Ex4_1(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // toString method
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}

class Suitcase {
    private int maxWeight;
    private ArrayList<Ex4_1> things;

    // Constructor
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void addThing(Ex4_1 thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);  // Add if within weight
        }
    }

    public String toString() {
        int totalWeight = totalWeight();  // Calculate weight
        if (things.isEmpty()) {
            return "empty (" + totalWeight + " kg)";
        } else if (things.size() == 1) {
            return "1 thing (" + totalWeight + " kg)";
        } else {
            return things.size() + " things (" + totalWeight + " kg)";
        }
    }

    public void printThings() {
        for (Ex4_1 thing : things) {
            System.out.println(thing);  // Print each thing
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Ex4_1 thing : things) {
            total += thing.getWeight();  // Calculate total weight
        }
        return total;
    }

    public Ex4_1 heaviestThing() {
        if (things.isEmpty()) return null;  // Handle empty suitcase
        Ex4_1 heaviest = things.get(0);  // Start with first
        for (Ex4_1 thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;  // Find heaviest
            }
        }
        return heaviest;
    }
}

class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    // Constructor
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);  // Add if within limit
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();  // Total weight of suitcases
        }
        return total;
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();  // Print all things
        }
    }
}
