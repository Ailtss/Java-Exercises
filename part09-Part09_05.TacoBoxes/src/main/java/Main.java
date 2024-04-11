
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        
        CustomTacoBox custom = new CustomTacoBox(5);
        
        custom.eat();
        custom.eat();
        custom.eat();
        
        System.out.println(custom.tacosRemaining());
        custom.eat();
        System.out.println(custom.tacosRemaining());
    }
}
