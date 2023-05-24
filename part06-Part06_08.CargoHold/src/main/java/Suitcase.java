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

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase (int maxWeight){
        this.maxWeight = maxWeight;
    }
    public void addItem(Item item){
        if (this.maxWeight<totalWeight() + item.getWeight()){
            return;
        }
            
        this.items.add(item);
        
    }
    public int totalWeight(){
        int totalWeight = 0;
        for (Item item:items){
           totalWeight += item.getWeight();
       }
        return totalWeight;
    }

    @Override
    public String toString() {
        if (this.items.size()==0){
            return "no items (0 kg)";
        } else if (this.items.size()==1){
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
       return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item item:items){
            System.out.println(item);
        }
    }
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        
        Item heaviest = items.get(0);
        for(Item item:items){
            if (item.getWeight()>heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    
}
