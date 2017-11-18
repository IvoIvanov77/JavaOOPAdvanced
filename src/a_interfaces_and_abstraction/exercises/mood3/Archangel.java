package a_interfaces_and_abstraction.exercises.mood3;

public class Archangel extends Character {

    public Archangel(String username, int level, Number specialPoints) {
        super(username, level, specialPoints);
    }

    @Override
    public String getHashedPassword() {
        return new StringBuilder(this.getUsername()).reverse().toString() + this.getUsername().length() * 21;
    }

    @Override
    public <T extends Number> T getSpecialPoints() {
        return null;
    }
}
