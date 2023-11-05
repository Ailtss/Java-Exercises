
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Abbreviations {
    
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        
        String key = formatString(abbreviation);
        
        if (this.abbreviations.containsKey(key)) {
            
            System.out.println("Abbreviation is already added!");
            return;
        }
        
        this.abbreviations.put(key, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        
        String key = formatString(abbreviation);
        
        return this.abbreviations.containsKey(key);
        
    }
    
    public String findExplanationFor(String abbreviation) {
        
        String key = formatString(abbreviation);
        
        return this.abbreviations.get(key);
    }
    
    public static String formatString(String s) {
        
        if (s == null) {
            
            return "";
        }
        
        s = s.toLowerCase();
        s = s.trim();
        
        return s;
    }
}
