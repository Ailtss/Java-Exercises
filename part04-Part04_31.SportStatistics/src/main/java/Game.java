/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ailtongfd
 */
public class Game {
    
    
    private String homeTeam;
    private String opposingTeam;
    int homeScore;
    int opposingScore;
    
    
    public Game(String homeTeam, String opposingTeam, int homeScore, int opposingScore) {
        
        this.homeTeam = homeTeam;
        this.opposingTeam = opposingTeam;
        this.homeScore = homeScore;
        this.opposingScore = opposingScore;
        
    }
    
    public String getHomeTeam() {
        
        return this.homeTeam;
    }
    
    public String getOpposingTeam() {
        
        return this.opposingTeam;
    }
    
    public boolean isWinner(String team) {
       
        if (team.equals(this.homeTeam) && this.homeScore > this.opposingScore) {
            
            return true;
            
        } else if (team.equals(this.opposingTeam) && this.opposingScore > this.homeScore) {
            
            return true;
        }
        
        return false;
    }
    
    
    @Override
    public String toString() {
        
        return this.homeTeam + ", " + this.opposingTeam + ", " + "Home score: " + this.homeScore + ", " + "Opposing Score: " + this.opposingScore;
    }
    
}
