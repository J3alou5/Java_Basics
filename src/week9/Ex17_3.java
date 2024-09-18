package week9;

public class Ex17_3 {
    private Ex17_1 ui;

    public Ex17_3(Ex17_1 ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            ui.update();
        }
    }
}