package week10;

public class Ex29_2 extends Ex29 {
    private int salary;

    public Ex29_2(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "\n  salary " + salary + " euros/month";
    }
}
