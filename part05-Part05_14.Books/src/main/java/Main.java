
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isFound=false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            isFound=false;
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            
            for (Book buk: books){
                if (buk.getName().equals(name) && buk.getPublicationYear()== publicationYear){
                    isFound = true;
                    System.out.println("The book is already on the list. Let's not add the same book again.");
                }
            }
            if (!isFound){
                books.add(book);
            }
            

        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
