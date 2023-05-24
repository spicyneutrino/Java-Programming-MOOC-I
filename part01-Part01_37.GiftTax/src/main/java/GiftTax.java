
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        Long giftValue = Long.valueOf(scan.nextLine());
        double giftTax = 0;
        if (giftValue > 1000000) {
            giftTax = ((142100 + 0.17 * (giftValue - 1000000)));
        } else if (giftValue > 200000) {
            giftTax = ((22100 + 0.15 * (giftValue - 200000)));
        } else if (giftValue > 55000) {
            giftTax = ((4700 + 0.12 * (giftValue - 55000)));
        } else if (giftValue > 25000) {
            giftTax = ((1700 + 0.10 * (giftValue - 25000)));
        } else if (giftValue >= 5000) {
            giftTax = ((100 + 0.08 * (giftValue - 5000)));
        } else {
            giftTax = 0;
        }

        if (giftTax != 0) {
            System.out.println("Tax: " + giftTax);
        } else {
            System.out.println("No tax!");
        }
    }
}
