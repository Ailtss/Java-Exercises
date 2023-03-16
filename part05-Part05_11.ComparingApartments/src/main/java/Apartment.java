
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    
    public int getSquares() {
        
        return this.squares;
    }
    
    
    public boolean largerThan(Apartment compared) {
        
        if (this.squares > compared.squares) {
            
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        
        int value1 = this.price();
        int value2 = compared.price();
        
        int priceDiff = value1 - value2;
        
        if (priceDiff < 0) {
            
            priceDiff = priceDiff * -1;
        }
        
        return priceDiff;
    }
    
    
    public boolean moreExpensiveThan(Apartment compared) {
        
        int valueThis = this.price();
        int valueCompared = compared.price();
        
        if (valueThis > valueCompared) {
            
            return true;
        }
        
        return false;
    }
    
    public int price() {
        
        return this.squares * this.princePerSquare;
    }

}
