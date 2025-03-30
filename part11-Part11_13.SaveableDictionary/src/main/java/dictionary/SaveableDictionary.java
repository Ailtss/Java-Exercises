package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private File file;

    public SaveableDictionary() {

        this.dictionary = new HashMap<>();
        this.file = new File("");
    }

    public SaveableDictionary(String file) {

        this.dictionary = new HashMap<>();
        this.file = new File(file);

    }

    public boolean load() {


        try {

            Scanner fileReader = new Scanner(this.file);

            if (fileReader.hasNextLine()) {

                while (fileReader.hasNextLine()) {
    
                    String line = fileReader.nextLine();
                    String[] parts = line.split(":");
                    this.dictionary.putIfAbsent(parts[0], parts[1]);
    
                }
    
                fileReader.close();
                return true;
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return false;

    }

    public boolean save() {

        try {
            PrintWriter writer = new PrintWriter(this.file);

            this.dictionary.forEach((key, value) -> writer.println(key + ":" + value));
    
            writer.close();
    
            return true;

        } catch (Exception e) {

            return false;
        }
    }

    public void add(String words, String translation) {

        this.dictionary.putIfAbsent(words, translation);

    }

    public String translate(String word) {

        if (this.dictionary.containsKey(word)) {

            return this.dictionary.get(word);

        } else if (this.dictionary.containsValue(word)) {

            // return this.dictionary.entrySet().stream()
            // .filter(entry -> entry.getValue().equals(word))
            // .findFirst()
            // .get()
            // .getKey();

            return this.dictionary.entrySet().stream().filter(e -> e.getValue().equals(word)).findFirst().get()
                    .getKey();
        }

        return null;
    }

    public void delete(String word) {

        this.dictionary.entrySet().removeIf(e -> e.getValue().equals(word) || e.getKey().equals(word));
    }
}
