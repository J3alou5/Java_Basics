package week5;

public class Ex87_1 {
    public static void main(String[] args) {
        Ex87 studioManhattan = new Ex87(1, 16, 5500);
        Ex87 twoRoomsBrooklyn = new Ex87(2, 38, 4200);
        Ex87 fourAndKitchenBronx = new Ex87(3, 78, 2500);

        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));

        System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));

        System.out.println(studioManhattan.moreExpensive(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.moreExpensive(twoRoomsBrooklyn));
    }
}
