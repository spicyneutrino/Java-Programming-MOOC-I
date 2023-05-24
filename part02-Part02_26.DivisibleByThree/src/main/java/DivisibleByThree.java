
public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(1, 10);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        // Write some code in here
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
