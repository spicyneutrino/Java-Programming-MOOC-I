
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = Integer.valueOf(scanner.nextLine());
        Integer num2 = Integer.valueOf(scanner.nextLine());
        int squareRoot = (int) (Math.sqrt(num1 + num2));
        System.out.println(squareRoot);
    }
}
