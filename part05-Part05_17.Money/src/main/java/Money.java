
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        
        Money m = new Money(this.euros+addition.euros, this.cents+addition.cents);
        
        return m;      
        
    }
    
    public boolean lessThan(Money compared) {
        
//        if (this.euros < compared.euros) {
//            
//            return true;
//            
//        } else if (this.euros == compared.euros && this.cents < compared.cents) {
//            
//            return true;
//        }
//        
//        return false;
        
        int a = 100*this.euros+this.cents; //valor geral de Money
        int b = 100*compared.euros+compared.cents; // valor geral de Money
        
        if (a < b) {
            
            return true;
        }
        
        return false;
        
    }
    
    public Money minus(Money decreaser) {
        
        int euros = this.euros-decreaser.euros;
        int cents = this.cents-decreaser.cents;
        
//        if (euros < 0 || (euros <= 0 && cents < 0)) {
//            
//            return new Money(0, 0);
//            
//        } else if (cents < 0) {
//            
//            euros = euros - 1;
//            cents = cents + 100;
//        }
//        
//        Money m = new Money(euros, cents);
//        
//        return m;

        if (cents < 0) {
            
            euros = euros - 1;
            cents = cents + 100;
        }
        
        if (euros < 0) {
            
            return new Money(0, 0);
        }
        
        return new Money(euros, cents);
        
        
    }

}
