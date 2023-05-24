
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Statistics stats1= new Statistics();
        Statistics stats2= new Statistics();
        Statistics stats3= new Statistics();
        
        System.out.println("Enter numbers:");
        Scanner sc = new Scanner(System.in);

        
        while(true){
            Integer number = Integer.valueOf(sc.nextLine());
            
            if (number ==-1){
                break;
            }  
            
            stats1.addNumber(number);
            
            if (number%2==0){
                stats2.addNumber(number);
            } else{
                stats3.addNumber(number);
            }
        }
        System.out.println("Sum: " + stats1.sum());
        System.out.println("Sum of even numbers: " + stats2.sum());
        System.out.println("Sum of odd numbers: " + stats3.sum());
        
    }
}
