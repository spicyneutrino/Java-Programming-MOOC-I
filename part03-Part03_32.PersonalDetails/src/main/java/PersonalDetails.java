
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longestWord = "";
        int maxWordLength = 0, dob = 0, sumDob = 0, count = 0;

        while (true) {
            String userInput = sc.nextLine();
            if (userInput.equals("")) {
                break;
            }
            count += 1;
            String[] pieces = userInput.split(",");
            dob = Integer.valueOf(pieces[1]);
            sumDob += dob;

            if (pieces[0].length() > maxWordLength) {
                maxWordLength = pieces[0].length();
                longestWord = pieces[0];
            }
        }
        System.out.println("Longest name: " + longestWord);
        float avgDob = (1f * sumDob / count);
        System.out.println("Average of the birth years: " + avgDob);
    }
}
