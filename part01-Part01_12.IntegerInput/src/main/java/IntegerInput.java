
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String number = scanner.nextLine();
        int value = Integer.valueOf(number);
        System.out.println("You gave the number " +value);
    }
}
