package week4;
import java.util.ArrayList;

public class Ex76 {

        private ArrayList<String> meals;

        public Ex76(){
            this.meals = new ArrayList<String>();
        }
    public void addMeal(String meal){
        if (!meals.contains(meal)){ //adds meal if it does not exist in menu
            meals.add(meal);
        }

    } //menu print
    public void printMenu(){
            for (String item : meals) {
                System.out.println(item);
            }
    }
    public void clearMenu(){
            meals.clear();
    }
}
