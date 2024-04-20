public class Book implements Packable {

    private String author;
    private String name;
    private double weight;

    public Book(String a, String n, double w) {

        this.author = a;
        this.name = n;
        this.weight = w;
    }

    @Override
    public String toString() {

        return this.author + ": " + this.name;
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
