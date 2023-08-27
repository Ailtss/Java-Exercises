
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ailtongfd
 */
public class JokeManager {
    
   private ArrayList<String> jokes;
   
    
    public JokeManager () {
        
        this.jokes = new ArrayList<>();
    }
    
    
    public void addJoke(String joke) {
        
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        
        if (this.jokes.isEmpty()) {
            
            return "Jokes are in short supply.";
            
        }
        
        Random draw = new Random();       
        int i = draw.nextInt(this.jokes.size());
        
        return this.jokes.get(i);
        
    }
    
    public void printJokes() {
        
        if (this.jokes.isEmpty()) {
            
            System.out.println("There's no jokes in the list!");
            return;
        }
        
        for (String j: this.jokes) {
            
            System.out.println(j);
        }
        
    }
    
   
}
