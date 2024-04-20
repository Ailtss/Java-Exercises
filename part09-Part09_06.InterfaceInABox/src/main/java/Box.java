import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxWeight;

    public Box(double w) {

        this.maxWeight = w;
        this.items = new ArrayList<>();

    }

    public void add(Packable p) {

        double spaceLeft = this.maxWeight - this.weight();

        if ((spaceLeft - p.weight()) >= 0) {

            this.items.add(p);
        }
    }

    @Override
    public String toString() {

        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

    @Override
    public double weight() {
        
        double totalWeight = 0.0;

        for (Packable p: this.items) {

            totalWeight = totalWeight + p.weight();
        }

        return totalWeight;
    }
}
