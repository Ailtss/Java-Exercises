
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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase (int weight) {
        
        items = new ArrayList<>();
        this.maximumWeight = weight;
        
    }
    
    
    public void addItem(Item item) {
        
        if (item.getWeight() + this.totalWeight() <= this.maximumWeight)
        {
            items.add(item);
        }
    }
    
    public void printItems() {
        
        if (this.items.isEmpty()) {
            
            System.out.println("There's nothing in the suitscase!");
            return;
        }
        
        for (Item i: this.items) {
            
            System.out.println(i);
        }
    }
    
    
    public Item heaviestItem() {
        
        if (this.items.isEmpty()) {
            
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (int i = 1; i < this.items.size(); i++) {
            
            Item item = this.items.get(i);
            
            if (heaviest.getWeight() < item.getWeight()) {
                
                heaviest = item;
            }
        }
        
        
        return heaviest;
    }
    
    public int totalWeight() {
        
        if (this.items.isEmpty()) {
            
            return 0;
        }
        
        int sumWeight = 0;
        
        for (Item i: items) {
            
            sumWeight += i.getWeight();
        }
        
        return sumWeight;
        
        
    }
    
    @Override
    public String toString() {
        
        if (this.items.isEmpty()) {
            
            return "no items (" +  this.totalWeight() + " kg)";
        } else if (this.items.size() == 1) {
            
            return this.items.size() + " item (" + this.totalWeight() + " kg)"; 
        }
        
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
}
