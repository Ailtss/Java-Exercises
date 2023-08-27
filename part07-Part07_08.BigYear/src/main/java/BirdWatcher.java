
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
public class BirdWatcher {
    
    private ArrayList<Bird> birds;
    
    public BirdWatcher() {
        
        this.birds = new ArrayList<>();
    }
    
    public ArrayList<Bird> getDataBase() {
        
        return this.birds;
    }
    
    public void addBird(String name, String latinName) {
        
        Bird b = new Bird(name, latinName);
        this.birds.add(b);
    }
    
    public boolean checkBird(String name) {
        
        for (Bird b: this.birds) {
            
            if (b.getName().toLowerCase().equals(name.toLowerCase())) {
                b.addObservation();
                return true;
            }
        }
        
        return false;
    }
    
    public void print() {
        
        if (this.birds.isEmpty()) {
            
            System.out.println("Não tem nenhum pássaro na Data Base!");
            return;
        }
        
        for (Bird b: this.birds) {
            
            System.out.println(b);
        }
        
    }
    
    public void print(String birdName) {
        
        if (this.birds.isEmpty()) {
            
            System.out.println("Não tem nenhum pássaro na Data Base!");
            return;
        }
        
        for (Bird b: this.birds) {
            
            if (b.getName().toLowerCase().equals(birdName.toLowerCase())) {
                
                System.out.println(b);
                return;
            } 
        }
        
        System.out.println("Bird not found!");
    }
    
}
