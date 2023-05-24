
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Stack {

    private ArrayList<String> list = new ArrayList<>();

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        list.add(value);
    }

    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take(){
        String lastItemAdded = this.list.get(list.size()-1);
        this.list.remove(list.size()-1);
        return lastItemAdded;
    }
    

}
