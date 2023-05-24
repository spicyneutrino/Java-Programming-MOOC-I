
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean isFound = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String newLine = scanFile.nextLine();
                if (searchedFor.equals(newLine)) {
                    isFound = true;
                }
            }
            
            
            
            if (isFound) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found.");
            }
        } catch (Exception e) {
            if (!isFound){
                System.out.println("Not Found.");
            }
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
