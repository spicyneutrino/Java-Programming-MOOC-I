
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String bookName;
        int pageNum, pubYear;
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            bookName = sc.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            pageNum = Integer.valueOf(sc.nextLine());
            System.out.print("Publication Year: ");
            pubYear = Integer.valueOf(sc.nextLine());

            Book a_book = new Book(bookName, pageNum, pubYear);
            book.add(a_book);
        }
        System.out.print("What information will be printed? ");
        String response = sc.nextLine();
        if (response.equals("everything")) {
            for (Book buk : book) {
                System.out.println(buk);
            }
        }
        if (response.equals("name")) {
            for (Book buk : book) {
                System.out.println(buk.getName());
            }
        }
    }
}
