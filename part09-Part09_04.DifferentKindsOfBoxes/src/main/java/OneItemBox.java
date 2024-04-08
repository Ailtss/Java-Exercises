/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class OneItemBox extends Box {
    
    private boolean switched;
    private Item i;
    
    
    public OneItemBox() {
        
        this.i = null;
        this.switched = false;
    }

    @Override
    public void add(Item item) {
        
        if (!switched) {
            
            this.i = item;
            this.switched = true;
        }
    }

    @Override
    public boolean isInBox(Item item) {
       
        if (switched) {
            
            if (this.i.equals(item)) {
                
                return true;
            }
        }
        
        return false;
    }
    
    
}
