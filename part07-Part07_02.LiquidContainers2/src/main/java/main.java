
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                System.out.println("First: " + firstContainer);
                break;
            }

            int amount = Integer.valueOf(parts[1]);

            if (parts[0].equals("add")) {
                // add to first container
                if (amount > 0) {
                    if (firstContainer.contains() + amount > 100) {
                        firstContainer.add(100);
                    } else {
                        firstContainer.add(amount);
                    }
                }

                continue;
            }

            if (parts[0].equals("move")) {
                // from first to second
                while (true) {
                    // firstContainer!=0 || secondContainer!=100 || amount ==0

                    if (amount > firstContainer.contains()) {
                        break;
                    }
                    secondContainer.add(1);
                    firstContainer.remove(1);
                    amount--;
                    if (firstContainer.contains() == 0 || secondContainer.contains() == 100 || amount == 0) {
                        break;
                    }
                }
                continue;
            }

            if (parts[0].equals("remove")) {
                if (amount > 0) {
                    if (secondContainer.contains() - amount < 0) {
                        secondContainer.remove(100);
                    } else {
                        secondContainer.remove(amount);
                    }
                }
                continue;
            }
            break;
        }

    }
}
