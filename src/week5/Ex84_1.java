package week5;

public class Ex84_1 {
    public static void main(String[] args) {
        Ex84 counter = new Ex84(25, true);

        counter.decrease(2);
        System.out.println(counter.getAmount());

        counter.increase(6);
        System.out.println(counter.getAmount());

        counter.decrease(100);
        System.out.println(counter.getAmount());

    }
}
