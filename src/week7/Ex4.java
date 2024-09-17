package week7;

public class Ex4 {
    public static void main(String[] args) {
        // Things
        Ex4_1 book = new Ex4_1("Happiness in Three Steps", 2);
        Ex4_1 mobile = new Ex4_1("Nokia 3210", 1);
        Ex4_1 brick = new Ex4_1("Brick", 4);

        // Suitcases
        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        // Container
        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        // Printing contents
        System.out.println(container);  // Show container
        container.printThings();  // Print all things

        // Test heaviest thing
        Ex4_1 heaviest = tomsCase.heaviestThing();
        System.out.println("Heaviest: " + heaviest);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i <= 100; i++) {
            Suitcase suitcase = new Suitcase(100);  // Create suitcase
            suitcase.addThing(new Ex4_1("Brick", i));  // Add brick
            container.addSuitcase(suitcase);  // Add suitcase
            if (container.totalWeight() >= 1000) break;  // Stop if weight limit reached
        }
    }
}
