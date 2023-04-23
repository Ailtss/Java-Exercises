
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        
        MessagingService ms = new MessagingService();
        
        ms.add(new Message("Ailton", "Olá, mundo!"));
        ms.add(new Message("Gabriel", "Hello World!"));
        
        
        System.out.println(ms.getMessages());
        
        
        for (Message m: ms.getMessages()) {
            
            System.out.println(m);
        }
    }
}
