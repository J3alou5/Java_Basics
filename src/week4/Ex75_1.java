package week4;

public class Ex75_1 {
    public static class DecreasingCounter {
        int value;
        int initialValue;

        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
            this.initialValue = valueAtStart;
        }

        // print the counter
        public void printValue() {
            System.out.println("value: " + this.value);
        }

        //decrease the value of the counter by one
        public void decrease() {
            // Decrease the value by one
            if (this.value > 0) {
                this.value--;
            }

        }

        // counter back to zero
        public void reset() {
            this.value = 0;
        }
        // counter back to start
        public void setInitial() {
            this.value = this.initialValue;
        }
    }
}

