package d_enumerations_and_anotations.exercises.inferno_infinity.enums;

public enum Gem  {


    RUBY(7, 2 ,5),
    EMERALD (1, 4, 9),
    AMETHYST (2, 8, 4);

    private int strength;
    private int agility;
    private int vitality;


    Gem(int strength, int agility, int vitality) {
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getVitality() {
        return vitality;
    }

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
