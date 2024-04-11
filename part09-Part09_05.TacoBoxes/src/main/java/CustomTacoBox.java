/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class CustomTacoBox implements TacoBox {
 
    private int tacos;
    
    public CustomTacoBox(int number) {
        
        this.tacos = number;
    }
    
    public int tacosRemaining() {
        
        return this.tacos;
    }
    
    
    public void eat() {
        
        if (this.tacos == 0) {
            return;
        }
        
        this.tacos = this.tacos-1;
    }
}
