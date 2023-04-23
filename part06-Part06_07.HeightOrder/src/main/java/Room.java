
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
public class Room {
    
    ArrayList<Person> persons;
    
    
    public Room() {
        
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        
        persons.add(person);
    }
    
    public boolean isEmpty() {
        
        if (this.persons.size() == 0) {
            
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        
        return this.persons;
    }
    
    
    public Person shortest() {
        
        if (this.isEmpty()) {
            
            return null;
        }
        
        Person p = this.getPersons().get(0);
        
        for (int i = 1; i < this.getPersons().size(); i++) {
            
            int height = this.getPersons().get(i).getHeight();
            
            if (p.getHeight() > height) {
                
                p = this.getPersons().get(i);
            }
        }
        
        return p;
    }
    
    
    public Person take() {
        
        
        if (this.isEmpty()) {
            
            return null;
        }
        
        Person p = this.shortest();
        this.getPersons().remove(p);
        
        return p;
    }
    
    
}
