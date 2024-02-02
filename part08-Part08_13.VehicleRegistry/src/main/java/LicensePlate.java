
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public boolean equals(Object o){
        
        if (this == o) {
            
            return true;
        }
        
        if (!(o instanceof LicensePlate)) {
            
            return false;
        }
        
        LicensePlate lp = (LicensePlate) o;
        
        
        if (this.country.equals(lp.country) && this.liNumber.equals(lp.liNumber)) {
            
            return true;
        }
        
        return false;
     }
    
    @Override
    public int hashCode() {
        
        int hash = 7;
        
        int countryToNumber = 0;
        
        for (char c: this.country.toCharArray()) {
            
            countryToNumber = countryToNumber + (c - 0);
        }
        
        int licenseToNumber = 0;
        
        for (char c: this.liNumber.toCharArray()) {
            
            licenseToNumber = licenseToNumber + (c - 0);
        }
        
        hash = hash * 13 + countryToNumber;
        hash = hash * 17 + licenseToNumber;
        
        return hash;
    }

}
