
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String luku = scanner.nextLine();
            if (luku.equals("")) {
                break;
            }

            list.add(luku);
        }

        System.out.print("Search for? ");
        String searchName = scanner.nextLine();

        if (list.contains(searchName)) {
            System.out.println(searchName + " was found!");
        } else {
            System.out.println(searchName + " was not found!");
        }

    }
}
