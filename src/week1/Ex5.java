package week1;

public class Ex5 {
    public static void main(String[] args) {
        int secMin = 60;
        int minHr = 60;
        int hrDay = 24;
        int dayYear = 365;

        int secYear = secMin * minHr * hrDay * dayYear;
        System.out.println("There are " + secYear + " seconds in a year");
    }
}
