
public class AdvancedAstrology {

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }

    public static void christmasTree(int height) {
        int numStars = 0, numGaps = 0;
        numGaps = height - 1;
        for (int i = 0; i < height; i++) {
            numStars = 2 * i + 1;

            printSpaces(numGaps);
            printStars(numStars);
            numGaps--;
            numStars += 2;
        }

        for (int k = 0; k < 2; k++) {
            printSpaces(numStars / 2 -2);
            printStars(3);
        }
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printStars(int number) {
        // you can print one star with the command
        for (int i = 0; i < number - 1; i++) {
            System.out.print("*");
        }
        System.out.println("*");

    }

    public static void printTriangle(int size) {
        int numGaps;
        for (int i = 1; i < size + 1; i++) {
            numGaps = size - i;
            printSpaces(numGaps);
            printStars(i);
        }

    }
}
