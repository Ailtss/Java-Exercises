
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Game> games = new ArrayList<>();
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        
        games = readFromFile(file);
       
        
        
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        
        for (Game g : games) {
            
            if(team.equals(g.getHomeTeam()) || team.equals(g.getOpposingTeam())) {
                
                gamesOfATeam.add(g);
            }
        }
        
        int wins = 0;
        
        for (Game g : gamesOfATeam) {
            
            if (g.isWinner(team)) {
                
                wins++;
            }
        }
        
        System.out.println("Games: " + gamesOfATeam.size());
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfATeam.size() - wins));
        
        
        System.out.println("");
        
        int[] values = gamesAndWinsByTeam(file, team);
        
        
        System.out.println("Games: " + values[0]);
        System.out.println("Wins: " + values[1]);
        System.out.println("Losses: " + values[2]);
               
    }
    
    
    public static int[] gamesAndWinsByTeam(String file, String team) {
        
        
        int games = 0;
        
        int wins = 0;
        
        int losses = 0;
        
        int[] values = new int[3];
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            while (fileReader.hasNextLine()) {
                
                String line = fileReader.nextLine();
                
                if (line.isEmpty() || !line.contains(team)) {
                    
                    continue;
                } 
                
                games++;
                
                String[] info = line.split(",");
                
                int score1 = Integer.valueOf(info[2]);
                int score2 = Integer.valueOf(info[3]);
                
                
                
                if (info[0].equals(team)) {
                    
                    if (score1 > score2) {
                        
                        wins++;
                    } else {
                        
                        losses++;
                    }
                } else {
                    
                    if (score2 > score1) {
                        
                        wins++;
                        
                    } else {
                        
                        losses++;
                    }
                }
                
                
                
            }
            
            
        } catch (Exception e) {
            
            System.out.println("Erro ao ler o arquivo.");
        }
        
        values[0] = games;
        values[1] = wins;
        values[2] = losses;
        
        return values;
    }
    
    
    
    public static ArrayList<Game> readFromFile(String file) {
        
        ArrayList<Game> games = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            while (fileReader.hasNextLine()) {
                
                
                String line = fileReader.nextLine();
                
                if (line.isEmpty()) {
                    
                    continue;
                }
                
                
                String[] info = line.split(",");
                
                int homeScore = Integer.valueOf(info[2]);
                int opposingScore = Integer.valueOf(info[3]);
                
                
                games.add(new Game(info[0], info[1], homeScore, opposingScore));
                
            }
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
        }
        
        return games;
    }
    

}
