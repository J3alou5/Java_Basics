package week10;

public class Ex29_1 extends Ex29 {
    private int credits;

    public Ex29_1(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return credits;
    }

    public String toString() {
        return super.toString() + "\n  credits " + credits;
    }
}
