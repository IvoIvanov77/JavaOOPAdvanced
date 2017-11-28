package e_reflection.exersise.pr0304Barracks.models.units;

public class Gunner extends AbstractUnit {

//    20 health and 20 attack

    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}
