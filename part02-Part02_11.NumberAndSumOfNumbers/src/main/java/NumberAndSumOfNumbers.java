
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            Integer num = Integer.valueOf(scanner.nextLine());
            if (num != 0) {
                sum += num;
                count += 1;
                continue;
            }
            if (num == 0) {
                System.out.println("Sum of the numbers: " + sum);
                System.out.println(" Number of numbers: " + count);
                break;
            }

        }
    }
}
