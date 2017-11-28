package d_enumerations_and_anotations.lab.wekdays;

public class WeeklyEntry implements Comparable<WeeklyEntry> {

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Weekday.valueOf(weekday.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", weekday, notes);
    }


    @Override
    public int compareTo(WeeklyEntry other) {
        return this.weekday.compareTo(other.weekday);
    }
}
