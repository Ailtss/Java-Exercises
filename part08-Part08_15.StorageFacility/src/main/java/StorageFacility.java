
import java.util.ArrayList;
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
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    
    public StorageFacility() {
        
        this.storage = new HashMap<>();
                    
    }
    
    public void add(String unit, String item) {
        
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
        
    }
    
    public void remove(String storageUnit, String item) {
        
        ArrayList<String> aux = this.storage.getOrDefault(storageUnit, new ArrayList<>());
        
        if (!(aux.isEmpty())) {
            
            aux.remove(item);
        }
        
        return;
    }
    
    public ArrayList<String> storageUnits() {
        
        ArrayList<String> sUnits = new ArrayList<>();
        
        for (String s: this.storage.keySet()) {
            
            if (!(this.storage.get(s).isEmpty())) {
                
                sUnits.add(s);
            }
        }
        
        return sUnits;
    }
    
}
