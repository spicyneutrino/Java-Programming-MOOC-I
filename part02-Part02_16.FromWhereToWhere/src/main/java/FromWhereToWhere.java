
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        Scanner sc = new Scanner(System.in);
        System.out.println("Where to? ");
        Integer end = Integer.valueOf(sc.next());
        System.out.println("Where from? ");
        Integer start = Integer.valueOf(sc.next());
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
