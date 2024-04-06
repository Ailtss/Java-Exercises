
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class ChangeHistory {
    
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        
        this.changes.add(status);
    }
    
    public void clear() {
        
        this.changes.clear();
    }
    
    @Override
    public String toString() {
        
        return this.changes.toString();
    }
    
    
    public double maxValue() {
        
        if (!(this.changes.isEmpty())) {
            
            double max = Collections.max(this.changes);
            
            return max;
        }
        
        return 0.0;
    }
    
    public double minValue() {
        
        if (!(this.changes.isEmpty())) {
            
            double min = Collections.min(this.changes);
            return min;
        }
        
        return 0.0;
    }
    
    public double average() {
        
        double sum = 0.0;
        
        if (!(this.changes.isEmpty())) {
            
            for (double d: this.changes) {
                
                sum = sum + d;
            }
            
            return sum / this.changes.size();
        }
        
        return 0;
    }
    
}
