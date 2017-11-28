package d_enumerations_and_anotations.exercises.cards_with_power;

public class Card implements Comparable<Card>{

    private Rank rank;
    private Suit suit;
    private int power;

    public Card(String rank, String suit) {
        this.setRank(rank);
        this.setSuit(suit);
        this.setPower();
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.setPower();
    }

    public int getPower() {
        return this.power;
    }

    private void setPower() {
        this.power = this.rank.getPowerOfRank() + this.suit.getPowerOfSuit();
    }

    private void setRank(String rank) {
        this.rank = Rank.valueOf(rank);
    }

    private void setSuit(String suit) {
        this.suit = Suit.valueOf(suit);
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
                this.rank.name(), this.suit.name());
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.getPower(), other.getPower());
    }
}
