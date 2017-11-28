package d_enumerations_and_anotations.lab.wekdays;

public interface IWeeklyCalendar {

    void addEntry(String weekday, String notes);
    Iterable<WeeklyEntry> getWeeklySchedule();

}
