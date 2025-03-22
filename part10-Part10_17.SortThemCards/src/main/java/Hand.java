import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable <Hand> {
    
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }


    public void add(Card c) {

        this.cards.add(c);
    }

    public void print() {

        this.cards.stream().forEach(c -> System.out.println(c));

    }

    public void sort() {

        this.cards.sort(Card::compareTo);
    }

    public int getHandValue() {

        return this.cards.stream().mapToInt(c -> c.getValue()).sum();
    }


    @Override
    public int compareTo(Hand o) {
        // TODO Auto-generated method stub
        return this.getHandValue() - o.getHandValue();

    }
    
    public void sortBySuit() {

        this.cards.sort(new BySuitInValueOrder());

    }
    
}
