package d_enumerations_and_anotations.exercises.cards_with_power;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        GameManager manager = new GameManager();

        manager.playGame();


//        Deck deck = new Deck();
//
//        String line = reader.readLine();
//
//        System.out.println(deck);

//        String line = reader.readLine();
//
//        System.out.println(getAnnotation(line));

//        String rank1 = reader.readLine();
//        String suit1 = reader.readLine();
//        String rank2 = reader.readLine();
//        String suit2 = reader.readLine();
//
//        Card card1 = new Card(rank1, suit1);
//        Card card2 = new Card(rank2, suit2);
//
//        if(card1.compareTo(card2) > 0){
//            System.out.println(card1);
//        }else {
//            System.out.println(card2);
//        }
    }

    private static String getAnnotation(String line) throws ClassNotFoundException {

        Info info = Class.forName("e_enumerations_and_anotations.exercises.cards_with_power." + line).getAnnotation(Info.class);

        return String.format("Type = %s, Description = %s",
                info.type(), info.description());
    }
}
