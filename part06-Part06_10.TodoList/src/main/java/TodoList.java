
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
public class TodoList {
    
    private ArrayList<String> toDoList;
    
    
    public TodoList() {
        
        this.toDoList = new ArrayList<>();
    }
    
    public void add(String task) {
        
        this.toDoList.add(task);
    }
    
    
    public void print() {
        
        if (this.toDoList.isEmpty()) {
            
            System.out.println("There's no task in the TodoList!");
            return;
        }
        
        for (int i = 0; i < this.toDoList.size(); i++) {
            
            System.out.println((i+1) + ": " + this.toDoList.get(i));
        }
    }
    
    public void remove(int number) {
        
        if (this.toDoList.isEmpty()) {
            
            System.out.println("There's no task in the TodoList to remove!");
            return;
        } else if (number <= 0) {
            
            System.out.println("Number passed is equal or less than zero!");
            return;
        }
        
        this.toDoList.remove(number-1);
    }
}
