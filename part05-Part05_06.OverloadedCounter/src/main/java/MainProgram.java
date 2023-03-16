
public class MainProgram {

    public static void main(String[] args) {
        
        
        // Test your counter here
        
        Counter c = new Counter(5);
        
        c.decrease();
        c.decrease(2);
        
        System.out.println(c.value());
        
        
        c.increase();
        c.increase(5);
        
        System.out.println(c.value());
    }
}
