package week9;

public class Ex18_1 implements Ex18 {
    private String name;
    private int volume;

    public Ex18_1(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }
}