
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        // write your code here

        int greatest = 0;
        if (number1 >= number2 && number1 >= number3) {
            greatest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            greatest = number2;
        } else{
            greatest = number3;
        }
        // do not print anything inside the method
        // there must be a return command at the end
        return greatest;
    }

    public static void main(String[] args) {
        int answer = greatest(-5, -8, -4);
        System.out.println("Greatest: " + answer);
    }
}
