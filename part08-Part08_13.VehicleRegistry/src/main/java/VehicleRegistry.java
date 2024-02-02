
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate,String> owners;
    
    
    public VehicleRegistry() {
        
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        String search = this.owners.getOrDefault(licensePlate, "not found");
        
        if (search.equals("not found")) {
            
            this.owners.put(licensePlate, owner);
            return true;
        } 
        
        return false;
        
    }
    
    public String get(LicensePlate licensePlate) {
        
        return this.owners.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        
        if (this.owners.containsKey(licensePlate)) {
            
            this.owners.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates() {
        
        for (LicensePlate p: this.owners.keySet()) {
            
            System.out.println(p);
        }
        
    }
    
    public void printOwners() {
        
        ArrayList<String> names = new ArrayList<>();
        
        
        for (String o: this.owners.values()) {
            
            if (!(names.contains(o))) {
                
                names.add(o);
                System.out.println(o);
            }
        }
    }
}
