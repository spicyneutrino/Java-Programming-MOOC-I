
public class Smallest {

    public static int smallest(int number1, int number2) {
        // write your code herea
        int smallest = 0;
        if (number1 < number2) {
            smallest = number1;
        }
        if (number2 < number1) {
            smallest = number2;
        }
        // do not print anything inside the method
        return smallest;

        // there must be a return command at the end
    }

    public static void main(String[] args) {
        int answer = smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }
}
