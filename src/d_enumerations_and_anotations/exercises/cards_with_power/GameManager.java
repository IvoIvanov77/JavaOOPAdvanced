package d_enumerations_and_anotations.exercises.cards_with_power;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameManager {

    private Deck deck;
    private Player first;
    private Player second;
    private Map<Integer, Card> handedOutCards;

    public GameManager() {
        this.deck = new Deck();
//        this.first = new Player(firstPlayerName);
//        this.second = new Player(secondPlayerName);
        this.handedOutCards = new HashMap<>();

    }

    public void playGame() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        this.first = new Player(reader.readLine());
        this.second = new Player(reader.readLine());

        handOutCards(reader, first);
        handOutCards(reader, second);

        Player winner = getWinner();

        System.out.println(String.format("%s wins with %s.",
                winner.getName(), winner.getHighestPoweredCard()));
    }

    private void handOutCards(BufferedReader reader, Player player) throws IOException {
        while(player.getCountOfCards() < 5){
            String line = reader.readLine();
            String[] input = line.split(" of ");
            try{
                Card card = new Card(input[0], input[1]);
                if(this.handedOutCards.containsKey(card.getPower())){
                    throw new UnsupportedOperationException("Card is not in the deck.");
                }
                player.addCard(card);
                this.handedOutCards.put(card.getPower(), card);
            }catch (IllegalArgumentException iae){
                System.out.println("No such card exists.");
            }catch (UnsupportedOperationException uoe){
                System.out.println(uoe.getMessage());
            }
        }
    }

    private Player getWinner(){
        if(first.getHighestPoweredCard().compareTo(second.getHighestPoweredCard()) > 0){
            return first;
        }
        return second;
    }
}
