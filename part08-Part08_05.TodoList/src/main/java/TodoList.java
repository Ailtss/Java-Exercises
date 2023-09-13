
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ailton Gabriel
 */
public class TodoList {
    
    private ArrayList<String> tasks;
    
    public TodoList() {
        
        this.tasks = new ArrayList<>();
    }
    
    
    public void add(String task) {
        
        this.tasks.add(task);
    }
    
    public void print() {
        
        int tamanho = this.tasks.size();
        
        for (int i = 0; i < tamanho; i++) {
            
            System.out.println((i+1)+": " + this.tasks.get(i));
        }
    }
    
    public void remove(int number) {
        
        if (number < 0 || number > this.tasks.size()) {
            
            return;
        }
        
        this.tasks.remove(number-1);
    }
    
}
