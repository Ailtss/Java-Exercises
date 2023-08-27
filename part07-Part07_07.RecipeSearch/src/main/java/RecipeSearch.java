
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        ArrayList<String> fileData = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("File do read: ");
        String fileName = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {

                String data = fileReader.nextLine();
                fileData.add(data);
            }
        } catch (Exception e) {

            System.out.println("Erro ao ler o arquivo");
        }

        Recipe a = new Recipe();
        ArrayList<Recipe> recipes = new ArrayList<>();

//        for (String s: fileData) {
//            
//            if (s.isEmpty()) {
//                
//                recipes.add(a);
//                a = new Recipe();
//                continue;
//            }
//            
//            a.add(s);
//        }
        for (int i = 0; i < fileData.size(); i++) {

            String s = fileData.get(i);

            if (s.isEmpty()) {

                recipes.add(a);
                a = new Recipe();
                continue;
            }

            a.add(s);

            if (i == fileData.size() - 1) {

                recipes.add(a);
            }
        }

        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {

            System.out.println("Enter command: ");

            String command = scanner.nextLine();
            System.out.println("");

            if (command.equals("stop")) {

                break;
            } else if (command.equals("list")) {

                System.out.println("Recipes: ");
                for (Recipe r : recipes) {

                    System.out.println(r);
                }

                System.out.println("");
            } else if (command.equals("find name")) {

                System.out.println("Searched word: ");
                String searchedWord = scanner.nextLine().toLowerCase();
                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe r : recipes) {

                    if (r.getRecipeName().toLowerCase().contains(searchedWord)) {

                        System.out.println(r);
                    }
                }

                System.out.println("");
            } else if (command.equals("find cooking time")) {

                System.out.println("Max cooking time: ");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe r : recipes) {

                    if (r.getCookingTime() <= cookingTime) {

                        System.out.println(r);
                    }
                }

                System.out.println("");
            } else if (command.equals("find ingredient")) {

                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine().toLowerCase();

                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe r : recipes) {

                    if (r.checkForIngredient(ingredient)) {

                        System.out.println(r);
                    }
                }
                
                System.out.println("");
            }

        }

    }
}
