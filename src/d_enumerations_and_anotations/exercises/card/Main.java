package d_enumerations_and_anotations.exercises.card;

public class Main {

    public static void main(String[] args) {

        CardRank[]ranks = CardRank.values();

        System.out.println("Card Ranks:");
        for (CardRank rank : ranks)  {
            System.out.println(String.format("Ordinal value: %d; Name value: %s",
                    rank.ordinal(), rank.name()));
        }
    }
}
