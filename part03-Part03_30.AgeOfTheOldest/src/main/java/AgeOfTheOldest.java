
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxAge = 0;
        int piece = 0;
        while (true) {
            String userInput = sc.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] pieces = userInput.split(",");
            piece = Integer.valueOf(pieces[1]);

            if (piece > maxAge) {
                maxAge = piece;
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
    }
}
