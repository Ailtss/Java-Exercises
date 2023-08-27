
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] vector = input.split(" "); //Separar a String inteira em um vetor pelo caractere de espaço

            String command = vector[0];
            int value = Integer.valueOf(vector[1]);

            if (command.equals("add")) {

                if (value >= 0) {

                    int total = first + value;

                    if (total <= 100) {

                        first += value;
                    } else {

                        first = 100;
                    }
                }

            } else if (command.equals("move")) {

                if (value >= 0) {
                    
                    if (value <= first) {

                        first -= value;
                        int total = second + value;

                        if (total <= 100) {

                            second += value;
                        } else {

                            second = 100;
                        }
                    } else {

                        int total = second + first;

                        if (total <= 100) {

                            second += first;
                        } else {

                            second = 100;
                        }
                        
                        first = 0;

                    }

                }

            } else if (command.equals("remove")) {
                
                if (value > 0) {
                    
                    if (value <= second) {
                        
                        second -= value;
                    } else {
                        
                        second = 0;
                    }
                }
            }

        }
    }

}


// Código modelo de solução do curso

/*


import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int first = 0;
        int second = 0;
 
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
 
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);
 
            if (input.equals("add") && amount > 0) {
                first = first + amount;
                if (first > 100) {
                    first = 100;
                }
            }
 
            if (input.equals("move") && amount > 0) {
                if (amount > first) {
                    amount = first;
                }
 
                first = first - amount;
                second = second + amount;
 
                if (second > 100) {
                    second = 100;
                }
            }
 
            if (input.equals("remove") && amount > 0) {
                second = second - amount;
                if (second < 0) {
                    second = 0;
                }
            }
 
            System.out.println("");
        }
    }
 
}



*/


