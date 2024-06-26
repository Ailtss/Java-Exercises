
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    
    @Override
    public void add(Item item) {
        
        int value = this.capacity - item.getWeight();
        
        if (value >= 0) {
            
            this.items.add(item);
            this.capacity = value;
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        
        if (this.items.contains(item)) {
            
            return true;
        }
        
        return false;
    }
}
