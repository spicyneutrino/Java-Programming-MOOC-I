import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birdList = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            switch (command) {
                case "All":
                    for (Bird bird : birdList) {
                        System.out.println(bird);
                    }
                    continue;
                case "Add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    birdList.add(new Bird(name, latinName));
                    continue;
                case "Observation":
                    System.out.print("Bird? ");
                    String temp = scanner.nextLine();
                    boolean found = false;


                    for (Bird bird : birdList) {
                        if (bird.getName().equalsIgnoreCase(temp)) {
                            bird.observation();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Not a bird!");
                    }
                    continue;

                case "One":
                    if (birdList == null || birdList.isEmpty()) {
                        break;
                    }
                    int index =0;
                    System.out.println(birdList.get(index));
                    index++;
                    continue;

            }
        }
    }
}