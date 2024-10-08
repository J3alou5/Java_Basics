package week5;

public class Ex87 {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeters;

    public Ex87(int rooms, int squareMeters, int pricePerSquareMeters) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeters = pricePerSquareMeters;
    }
    public boolean larger(Ex87 other) {
        return this.pricePerSquareMeters < other.pricePerSquareMeters;
    }
    public int priceDifference(Ex87 other) {
        return Math.abs(this.pricePerSquareMeters * this.squareMeters - other.pricePerSquareMeters * other.squareMeters);
    }
    public boolean moreExpensive(Ex87 other) {
        return this.pricePerSquareMeters * this.squareMeters > other.pricePerSquareMeters * other.squareMeters;
    }
}
