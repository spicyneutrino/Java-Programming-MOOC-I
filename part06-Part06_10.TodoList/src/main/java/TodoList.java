/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todo = new ArrayList();
     
    public TodoList(){
        
    }
    
    public void add(String task){
        todo.add(task);
    }
    
    public void print(){
        for (String item:todo){
            System.out.println((this.todo.indexOf(item) + 1) + ": " + item);
        }
        
    }
    public void remove(int number){
        this.todo.remove(number -1);
    }
    
}
