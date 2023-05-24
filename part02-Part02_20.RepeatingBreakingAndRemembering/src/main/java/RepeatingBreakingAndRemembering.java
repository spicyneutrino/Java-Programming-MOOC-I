
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner sc = new Scanner(System.in);

        System.out.println("Give numbers:");

        Integer sum = 0, count = 0, even = 0, odd = 0;

        while (true) {
            Integer num = Integer.valueOf(sc.next());

            if (num == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                Float average = 1.0f * sum / count;
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }

            sum += num;
            count++;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

    }
}
