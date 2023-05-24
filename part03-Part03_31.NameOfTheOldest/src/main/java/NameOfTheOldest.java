
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxAge = 0;
        int piece = 0;
        String oldestName = "";
        while (true) {
            String userInput = sc.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] pieces = userInput.split(",");
            piece = Integer.valueOf(pieces[1]);

            if (piece > maxAge) {
                maxAge = piece;
                oldestName = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
