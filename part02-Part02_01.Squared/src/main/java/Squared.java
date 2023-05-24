
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //program below

        int num = Integer.valueOf(scanner.nextLine());
        long square = num*num;
        System.out.println(square);
    }
}
