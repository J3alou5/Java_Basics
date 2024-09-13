package week4;

public class Ex75 {
    public static void main(String[] args) {
        Ex75_1 Ex75_1 = new Ex75_1();
        Ex75_1.DecreasingCounter counter = new Ex75_1.DecreasingCounter(10);

        while (counter.value > 0) {
            counter.printValue();
            counter.decrease();
        }
    }
}
