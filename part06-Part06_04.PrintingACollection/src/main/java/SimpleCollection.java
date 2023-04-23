
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        
        if (this.elements.isEmpty()) {
            
            return "The collection " + this.name + " is empty.";
        } 
        
        String values = "";
        
        if (this.elements.size() == 1) {
            
            values = values + this.elements.get(0);
            
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + "\n"+ values;
            
        }
        
        
        for (String v: this.elements) {
            
            values = values + "\n" + v;
        }
        
        return "The collection " + this.name + " has " + this.elements.size() + " elements:" + values;
        
    }
    
}
