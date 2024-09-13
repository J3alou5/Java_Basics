package week4;

public class Ex75_1 {
    public static class DecreasingCounter {
        private int value;   

        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
        }

        // print the counter
        public void printValue() {
            System.out.println("value: " + this.value);
        }

        //decrease the value of the counter by one
        public void decrease() {
            // Decrease the value by one
            this.value -= 1;
        }

        // counter back to zero
        public void reset() {
            this.value = 0;
        }
    }
}

