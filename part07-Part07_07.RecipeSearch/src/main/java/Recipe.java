
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
public class Recipe {
    
    private ArrayList<String> information;
    
    public Recipe() {
        
        this.information = new ArrayList<>();
    }
    
    public void add(String r) {
        
        this.information.add(r);
    }
    
    public ArrayList<String> getRecipe() {
        
        return this.information;
    }
    
    public void clearRecipe() {
        
        this.information.clear();
    }
    
    public void printRecipe() {
        
        for (String a: this.getRecipe()) {
            
            System.out.println(a);
        }
    }
    
    public String getRecipeName() {
        
        return this.information.get(0);
    }
    
    public int getCookingTime() {
        
        return Integer.valueOf(this.information.get(1));
    }
    
    public boolean checkForIngredient(String ingredient) {
        
        for (int i = 2; i < this.information.size(); i++) {
            
            if (this.information.get(i).toLowerCase().equals(ingredient)) {
                
                return true;
            }
        }
        
        return false;
    }
     
    @Override
    public String toString() {
        
        return this.information.get(0) + ", " + "cooking time: " + Integer.valueOf(this.information.get(1));
    }
}
