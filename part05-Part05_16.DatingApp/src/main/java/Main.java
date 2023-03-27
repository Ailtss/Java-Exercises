
public class Main {

    public static void main(String[] args) {
        // test your program here!
        
        SimpleDate d = new SimpleDate(30, 12, 2023);
        
        System.out.println(d);
        
        d.advance();
        
        System.out.println(d);
      
        SimpleDate c= new SimpleDate(29, 11, 2024);
        
        System.out.println(c);
        
        c.advance();
        
        System.out.println(c);
        
        c.advance();
        
        System.out.println(c);
        
        c.advance(30);
        
        System.out.println(c);
        
        
        System.out.println("");
        System.out.println("");
        
        
        SimpleDate now = new SimpleDate(26, 3, 2023);
        
        
        SimpleDate after = now.afterNumberOfDays(5);
        
        
        System.out.println(now);
        System.out.println(after);
        
    }
}
