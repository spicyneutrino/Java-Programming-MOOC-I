
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Give a number:");
            Integer response = Integer.valueOf(scanner.nextLine());
            if (response == 4) {
                break;
            }
        }
    }
}
