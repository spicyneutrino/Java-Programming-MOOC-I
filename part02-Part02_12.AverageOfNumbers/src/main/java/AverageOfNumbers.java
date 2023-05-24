
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // program below
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            Integer num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                float average = (float) sum / count;
                if (count == 0) {
                    System.out.println("Average of the numbers: " + "Nnot");
                } else {
                    System.out.println("Average of the numbers: " + average);
                }
                break;
            } else {
                sum += num;
                count++;
                continue;
            }
        }

    }
}
