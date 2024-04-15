package christmas.model.event.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public enum EventCalendar {
    D_DAY_EVENT(IntStream.rangeClosed(1, 25)
            .mapToObj(Integer::toString)
            .collect(toList())),
    WEEKDAY_EVENT(Arrays.asList("3", "4", "5", "6", "7", "10", "11", "12", "13", "14", "17", "18", "19", "20", "21", "24", "25", "26", "27", "28", "31")),
    HOLIDAY_EVENT(Arrays.asList("1", "2", "8", "9", "15", "16", "22", "23", "29", "30")),
    SPECIAL_EVENT(Arrays.asList("3", "10", "17", "24", "25", "31"));

    private List<String> period;

    EventCalendar(List<String> period) {
        this.period = period;
    }

    public List<String> getPeriod() {
        return period;
    }
}
