
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class UserInterface {

    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            switch (command) {
                case "stop":
                    shouldContinue = false;
                    
                    break;
                case "add":
                    System.out.print("To add: ");
                    String task = scanner.nextLine();
                    this.todo.add(task);
                    
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int index = Integer.valueOf(scanner.nextLine());
                    this.todo.remove(index);
                    
                    break;
                case "list":
                    this.todo.print();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
