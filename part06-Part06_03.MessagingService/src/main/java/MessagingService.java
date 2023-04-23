
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ailtongfd
 */
public class MessagingService {
    
    private ArrayList<Message> msService;
    
    
    public MessagingService() {
        
        this.msService = new ArrayList<Message>();
    }
    
    
    public void add(Message message) {
        
        if (message.getContent().length() <= 280) {
            
            this.msService.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        
        return this.msService;
    }
    
}
