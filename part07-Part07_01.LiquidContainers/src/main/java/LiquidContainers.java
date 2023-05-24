
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = 0;
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            }

            amount = Integer.valueOf(parts[1]);

            if (parts[0].equals("add")) {
                // add to first container
                if (amount > 0) {
                    if (firstContainer + amount > 100) {
                        firstContainer = 100;
                    } else {
                        firstContainer += amount;
                    }
                }

                continue;
            }

            if (parts[0].equals("move")) {
                // from first to second
                while (true) {
                    // firstContainer!=0 || secondContainer!=100 || amount ==0
                    
                    if (amount> firstContainer){
                        break;
                    }
                    secondContainer++;
                    firstContainer--;
                    amount--;
                    if (firstContainer == 0 || secondContainer == 100 || amount == 0) {
                        break;
                    }
                }
                continue;
            }

            if (parts[0].equals("remove")) {
                if (amount>0){
                    if (secondContainer - amount < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                }
                continue;
            }
            
            break;
        }
    }
}
