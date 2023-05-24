
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String variable_string = scanner.nextLine();
        System.out.println("Give an integer:");
        Integer variable_integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        Double variable_double = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        Boolean variable_boolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + variable_string);
        System.out.println("You gave the integer " + variable_integer);
        System.out.println("You gave the double " + variable_double);
        System.out.println("You gave the boolean " + variable_boolean);
    }
}
