package week4;

public class Ex76_1 {
    public static void main(String[] args) {
        Ex76 menu = new Ex76();

        // Add meal
        menu.addMeal("Pizza");
        menu.addMeal("Hamburger");
        menu.addMeal("Spaghetti");

        // print menu
        menu.printMenu();
        // clear menu
        menu.clearMenu();
        menu.printMenu();
    }
}
