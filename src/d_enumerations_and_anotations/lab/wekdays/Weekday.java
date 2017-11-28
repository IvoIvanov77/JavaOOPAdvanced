package d_enumerations_and_anotations.lab.wekdays;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toString() {
        String lower = super.name().substring(1).toLowerCase();
        return super.name().charAt(0) + lower;
    }

}
