package d_enumerations_and_anotations.lab.wekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar implements IWeeklyCalendar {

    private List<WeeklyEntry> entryList;

    public WeeklyCalendar() {
        this.entryList = new ArrayList<>();
    }

    @Override
    public void addEntry(String weekday, String notes) {
        this.entryList.add(new WeeklyEntry(weekday, notes));
    }

    @Override
    public Iterable<WeeklyEntry> getWeeklySchedule() {
        Collections.sort(this.entryList);
        return this.entryList;
    }
}
