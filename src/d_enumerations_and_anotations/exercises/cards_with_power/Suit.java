package d_enumerations_and_anotations.exercises.cards_with_power;

@Info(category = "Suit", description = "Provides suit constants for a Card class.")
public enum Suit {

//    (CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39)

    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int powerOfSuit;

    Suit(int powerOfSuit) {
        this.powerOfSuit = powerOfSuit;
    }

    public int getPowerOfSuit() {
        return powerOfSuit;
    }
}
