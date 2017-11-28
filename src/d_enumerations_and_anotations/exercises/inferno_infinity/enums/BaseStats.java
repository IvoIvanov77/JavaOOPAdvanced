package d_enumerations_and_anotations.exercises.inferno_infinity.enums;

public enum BaseStats {

    AXE(5, 10, 4),
    SWORD(4, 6, 3),
    KNIFE(3, 4, 2);

    private int minDamage;
    private int maxDamage;
    private int sockets;

    BaseStats(int minDamage, int maxDamage, int sockets) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.sockets = sockets;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getSockets() {
        return sockets;
    }

    @Override
    public String toString() {

        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
