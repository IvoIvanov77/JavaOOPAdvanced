package d_enumerations_and_anotations.exercises.cards_with_power;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.cards = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public int getCountOfCards(){
        return this.cards.size();
    }


    public Card getHighestPoweredCard(){
        int power = 0;
        Card result = this.cards.get(0);
        for (Card card : cards) {
            if(card.getPower() > power){
                power = card.getPower();
                result = card;
            }
        }

        return result;
    }
}
