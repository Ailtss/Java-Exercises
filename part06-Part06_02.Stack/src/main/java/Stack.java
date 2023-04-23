
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
public class Stack {
    
    private ArrayList<String> things;
    
    
    public Stack() {
        
        this.things = new ArrayList<String>();
    }
    
    public boolean isEmpty() {
        
        if (this.things.isEmpty()) {
            
            return true;
        }
        
        return false;
    }
    
    
    public void add(String value) {
        
        if (this.things.size() == 0) {
            
            this.things.add(value);
            return;
        }
        
        this.things.add(value);
        
        for (int i = this.things.size()-1; i > 0; i--) {
            
                String last = this.things.get(i);
                String beforeLast = this.things.get(i-1);
                
                this.things.set(i-1, last);
                this.things.set(i, beforeLast);
        }
    }
    
    public ArrayList<String> values() {
        
        return this.things;
    }
    
    
    public String take() {
        
        String taken = this.things.get(0);
        this.things.remove(0);
        
        return taken;
    }
    
    public void printStack() {
        
        for (String s: this.things) {
            
            System.out.println(s);
        }
    }
    
    
}
