
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String newLine = scanFile.nextLine();
                String[] array = newLine.split(",");
                String name = array[0];
                int age = Integer.valueOf(array[1]);

                if (age >1 || age ==0) {
                    System.out.println(name + ", age: " + age + " year");
                }
                System.out.println(name + ", age: " + age + " years");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
