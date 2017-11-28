package d_enumerations_and_anotations.exercises.cards_with_power;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        this.setCards();
    }

    private void setCards() {
        this.cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.cards.get(0).toString());
        for (int i = 1; i < this.cards.size(); i++) {
            builder.append("\n").append(this.cards.get(i));
        }
        return builder.toString();
    }
}
