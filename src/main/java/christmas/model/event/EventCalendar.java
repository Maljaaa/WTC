package christmas.model.event;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public enum EventCalendar {
    D_DAY_EVENT(IntStream.rangeClosed(1, 25)
            .mapToObj(Integer::toString)
            .collect(toList())),
    WEEKDAY_EVENT(Arrays.asList("4", "7", "11", "14", "18", "21", "25", "28")),
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
