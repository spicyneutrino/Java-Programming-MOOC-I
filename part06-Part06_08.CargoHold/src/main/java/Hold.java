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

public class Hold {

    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight < this.totalWeight() + suitcase.totalWeight()){
            return ;
        }
        this.suitcases.add(suitcase);
    }
    
    public int totalWeight(){
        int totalWeight=0;
        for (Suitcase suitcase:suitcases){
            totalWeight+=suitcase.totalWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for (Suitcase suitcase:suitcases){
            suitcase.printItems();
        }
    }

}
