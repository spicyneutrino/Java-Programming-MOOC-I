
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // program below
        
        Integer pCount = 0;
        Integer pSum = 0;

        while (true) {
            Integer num = Integer.valueOf(sc.nextLine());
            if (num > 0) {
                pCount++;
                pSum += num;
            }

            if (num == 0) {
                if (pCount == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    Float pAverage = 1.0f * pSum / pCount;
                    System.out.println(pAverage);

                }
                break;
            }
        }

    }

}
