
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pair> list = new ArrayList<>();
        boolean isFound = false;
        String identifier = "";
        while (true) {
            isFound = false;
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            for (Pair item: list){
                if (identifier.equals(item.getIdentifier())){
                    isFound = true;
                    break;
                }
            } 
            if (!isFound) list.add(new Pair(identifier, name));
            
        }
        
        for (Pair item: list){
            System.out.println(item.toString());
        }
        
    }
}
