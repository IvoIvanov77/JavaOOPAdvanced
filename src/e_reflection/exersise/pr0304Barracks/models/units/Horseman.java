package e_reflection.exersise.pr0304Barracks.models.units;

public class Horseman extends AbstractUnit {

//    with 50 health and 10 attack
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
