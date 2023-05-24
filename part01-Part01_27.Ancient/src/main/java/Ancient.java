
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        Integer response = Integer.valueOf(scan.nextLine());
        if (response<2015){
            System.out.println("Ancient history!");
        }
    }
}
