public class CD implements Packable {

    private String artist;
    private String name;
    private int year;

    public CD(String a, String n, int y) {

        this.artist = a;
        this.name = n;
        this.year = y;
    }

    @Override
    public String toString() {

        return this.artist + ": " + this.name + " (" + this.year + ")";
    }

    @Override
    public double weight() {

        return 0.1;
    }
}
