package a_interfaces_and_abstraction.exercises.mood3;

public class Demon extends Character {

    private Double energy;

    public Demon(String username, int level, Number specialPoints, Double energy) {
        super(username, level, specialPoints);
        this.energy = energy;
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getHashedPassword() {
        return "" + this.getUsername().length() * 277;
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public Double getSpecialPoints() {
        return this.energy;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n" +
                "%.1f",
                super.toString(), this.getSpecialPoints() * this.getLevel()
        );
    }
}
