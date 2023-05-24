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

public class Package {
    private ArrayList<Gift> packageList = new ArrayList<>();
    
    public Package(){
        
    }
    
    public void addGift(Gift gift){
        packageList.add(gift);
    }
    public int totalWeight(){
        int totalWeight =0;
        for (Gift eachGift: packageList ){
            totalWeight += eachGift.getWeight();
        }
        return totalWeight;
    }
}
