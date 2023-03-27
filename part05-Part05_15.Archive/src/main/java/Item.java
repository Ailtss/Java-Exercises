/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ailtongfd
 */
public class Item {
    
    private String id;
    private String name;
    
    
    public Item(String id, String name) {
        
        this.id = id;
        this.name = name;
    }
    
    
    public String getId() {
        
        return this.id;
    }    
    
    public String getName() {
        
        return this.name;
    }
    
    
    @Override
    public boolean equals(Object compared) {
        
        if (this == compared) {
            
            return true;
        }
        
        
        
        if (!(compared instanceof Item)) {
            
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        if (this.id.equals(comparedItem.getId())) {
            
            return true;
        }
        
        return false;
        
    }
    
    
    @Override
    public String toString() {
        
        return this.id + ": " + this.name;
    }
    
}
