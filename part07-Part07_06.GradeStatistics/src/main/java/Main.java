
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // Write your program here -- consider breaking the program into
        // multiple classes.

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            } else if (number<0 || number >100) {
                continue;
            }
            list.add(number);
            // if (number >= 0 || number <= 100)
        }
        pointAverage(list);
        pointAveragePass(list);
        grades(list);
    }

    public static void pointAverage(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return;
        }
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = 1.0 * sum / numbers.size();
        System.out.println("Point average (all): " + average);
    }

    public static void pointAveragePass(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.size() == 0) {
            return;
        }
        int sum = 0, count = 0;

        for (int number : numbers) {
            if (number >= 50) {
                sum += number;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Point average (passing): -");
            return;
        }
        double average = 1.0 * sum / count;
        System.out.println("Point average (passing): " + average);
        System.out.println("Pass percentage: " + (100.0 * count / numbers.size()));
    }

    public static void grades(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return;
        }

        System.out.println("Grade distribution:");

        int grade = 0;
        int[] grades = new int[6];

        for (int number : numbers) {
            if (number < 50) {
                grade = 0;
            } else if (number < 60) {
                grade = 1;
            } else if (number < 70) {
                grade = 2;
            } else if (number < 80) {
                grade = 3;
            } else if (number < 90) {
                grade = 4;
            } else if (number >= 90) {
                grade = 5;
            }
            grades[grade]++;
        }

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int k = 0; k < grades[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
