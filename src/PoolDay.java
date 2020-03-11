import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peoples = Integer.parseInt(scan.nextLine());
        double tax = Double.parseDouble(scan.nextLine());
        double deckChairPrice = Double.parseDouble(scan.nextLine());
        double umbrelaPrice = Double.parseDouble(scan.nextLine());
        double totalDeckChairPrice=Math.ceil(0.75*peoples) * deckChairPrice;
        double totalUmbrelaPrice=Math.ceil(1.0 * peoples / 2) * umbrelaPrice;
        double totalPrice = peoples * tax + totalDeckChairPrice + totalUmbrelaPrice;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
