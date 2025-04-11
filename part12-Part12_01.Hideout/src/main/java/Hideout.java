import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    
    private List<T> hideout;


    public Hideout() {

        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {

        if (toHide != null && !hideout.contains(toHide)) {
            
            hideout.add(toHide);
        }
            
    }

    public T takeFromHideout() {
        
        if (this.hideout.isEmpty()) {

            return null;
        }

        return this.hideout.remove(this.hideout.size()-1);
        
    }


    public boolean isInHideout() {

        return this.hideout.isEmpty();
    }


}
