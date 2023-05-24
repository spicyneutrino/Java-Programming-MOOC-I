
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number? ");
        Integer start = Integer.valueOf(sc.next());
        System.out.println("Last number? ");
        Integer end = Integer.valueOf(sc.next());
        Integer sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
