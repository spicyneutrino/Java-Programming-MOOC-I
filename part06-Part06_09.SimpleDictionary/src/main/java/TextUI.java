
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict = new SimpleDictionary();

    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.scanner = scan;
        this.dict = dict;
    }

    public void start() {
        String command = "";
        Boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.print("Command: ");
            command = this.scanner.nextLine();
            
            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    shouldContinue = false;
                    
                    break;
                case "add":
                    System.out.print("Word: ");
                    String word = this.scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = this.scanner.nextLine();

                    this.dict.add(word, translation);
                    
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String toTranslate = this.scanner.nextLine();

                    if (this.dict.translate(toTranslate)==null) {
                        System.out.print("Word " + toTranslate + " was not found");
                    }else{
                        System.out.print(this.dict.translate(toTranslate));
                    }                    
                    
                    break;
                default:
                    System.out.print("Unknown command");
            }
            System.out.println("");
        }
    }
}
