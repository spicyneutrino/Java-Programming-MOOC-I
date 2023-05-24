
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String userInput = sc.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] pieces = userInput.split(" ");
            System.out.println(pieces[pieces.length -1]);
            
        }
    }
}
