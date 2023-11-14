package christmas.model;

import java.util.Arrays;
import java.util.List;

public enum EventCalendar {
    D_DAY_EVENT(Arrays.asList(Arrays.asList(1, 25))),
    WEEKDAY_EVENT(Arrays.asList(Arrays.asList(4, 7), Arrays.asList(11, 14), Arrays.asList(18, 21), Arrays.asList(25, 28))),
    HOLIDAY_EVENT(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(8, 9), Arrays.asList(15, 16), Arrays.asList(22, 23), Arrays.asList(29, 30))),
    SPECIAL_EVENT(Arrays.asList(Arrays.asList(3), Arrays.asList(10), Arrays.asList(17), Arrays.asList(24), Arrays.asList(25), Arrays.asList(31)));

    private List<List<Integer>> period;

    EventCalendar(List<List<Integer>> period) {
        this.period = period;
    }

    public List<List<Integer>> getPeriod() {
        return period;
    }
}
