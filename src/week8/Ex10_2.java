package week8;

public class Ex10_2 implements Ex10 {
    private int daysLeft;

    public Ex10_2() {
        this.daysLeft = 362;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
