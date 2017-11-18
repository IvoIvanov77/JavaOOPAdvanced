package a_interfaces_and_abstraction.exercises.I_MooD3;

public class Archangel extends Hero {

    private int mana;

    Archangel(String username, int mana, int level) {
        super(username, level, "");
        this.setSpecialPoints(mana);
        this.setHashedPassword(new StringBuilder(this.getUsername()).reverse().toString() + (this.getUsername().length()*21));
    }

    private void setSpecialPoints(int specialPoints) {
        this.mana = specialPoints;
    }

    @Override
    public String toString() {
        return super.toString() + this.mana * this.getLevel();
    }
}