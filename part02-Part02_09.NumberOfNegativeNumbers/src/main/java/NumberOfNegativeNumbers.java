
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            Integer num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                count += 1;
                continue;
            }
            if (num == 0) {
                System.out.println("Number of negative numbers: " + count);
                break;
            }

        }
    }
}
