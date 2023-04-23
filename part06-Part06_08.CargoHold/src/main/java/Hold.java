
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ailtongfd
 */
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    
    
    public Hold (int maximumWeight) {
        
        suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    
    public void addSuitcase(Suitcase suitcase) {
        
        if (suitcase.totalWeight() + this.totalHoldWeight() <= this.maximumWeight) {
            
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalHoldWeight() {
        
        if (this.suitcases.isEmpty()) {
            
            return 0;
        }
        
        int sum = 0;
        
        for (Suitcase s: this.suitcases) {
            
            sum += s.totalWeight();
        }
        
        return sum;
    }
    
    
    public void printItems() {
        
        if (this.suitcases.isEmpty()) {
            
            System.out.println("There's no suitcases in this hold!");
            return;
        }
        
        for (Suitcase s: this.suitcases) {
            
            s.printItems();
        }
    }
    
    
    @Override
    public String toString() {
        
        if (this.suitcases.isEmpty()) {
            
            return "no suitcases (" +  this.totalHoldWeight() + " kg)";
            
        } else if (this.suitcases.size() == 1) {
            
            return this.suitcases.size() + " suitcase (" + this.totalHoldWeight() + " kg)";
        }
        
        return this.suitcases.size() + " suitcases (" + this.totalHoldWeight() + " kg)";
    }
    
}
