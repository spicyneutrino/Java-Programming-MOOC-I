
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scIo = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String fileName = scIo.nextLine();
        try (Scanner scFile = new Scanner(Paths.get(fileName)) ){
            while(scFile.hasNextLine()){
                String row = scFile.nextLine();
                System.out.println(row);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}
