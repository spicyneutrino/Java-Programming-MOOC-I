
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer newTimer = new Timer();
        int count = 0;
        
        while(count!=300){
            System.out.println(newTimer);
            newTimer.advance();
            count++;
        }

    }
}
