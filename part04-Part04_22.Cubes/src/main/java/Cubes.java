
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            int num = Integer.valueOf(line);
            System.out.println(num * num * num);
        }
    }
}
