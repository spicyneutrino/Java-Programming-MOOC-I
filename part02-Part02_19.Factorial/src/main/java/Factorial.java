
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number: ");
        Integer end = Integer.valueOf(sc.next());
        Long fact = (long) 1;
        for (int i = 1; i <= end; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

    }
}
