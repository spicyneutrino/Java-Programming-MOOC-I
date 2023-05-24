
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Integer count = 0;
        System.out.println("How many times?");
        Scanner sc = new Scanner(System.in);
        Integer num = Integer.valueOf(sc.nextLine());
        while (count < num) {
            printText();
            count++;
        }

    }

    public static void printText() {
        // Write some code in here
        System.out.println("In a hole in the ground there lived a method");
    }
}
