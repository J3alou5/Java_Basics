package week5;

public class Ex84 {
    private int value;
    private Boolean check;
    public Ex84(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }
    public Ex84(int startingValue) {
        this(startingValue, false);
    }
    public Ex84(boolean check) {
        this(0, check);
    }
    public Ex84() {
        this(0);
    }
    public int value() {
        return value;
    }
    public void increase() {
        value++;
    }
    public void increase(int increaseAmount){
        if (increaseAmount > 0){
        value += increaseAmount;
        }
    }
    public void decrease() {
        if (this.check) {
            if (this.value > 0) {
                value--;
            }
        }else {
            this.value--;
        }
    }
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.check) {
                if (decreaseAmount > this.value) {
                    this.value = 0;
                }
            } else {
                this.value -= decreaseAmount;
            }
        }
    }

    public int getAmount() {
        return this.value;
    }
}
