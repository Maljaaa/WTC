package christmas.service;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class EventService {

    public List<String> getMenuName(String order) {

        return Arrays.stream(order.split(","))
                .map(s -> s.substring(0, s.indexOf('-')))
                .collect(toList());
    }

    public List<Integer> getMenuCount(String order) {
        return Arrays.stream(order.split(","))
                .map(s -> s.substring(s.indexOf('-') + 1))
                .map(Integer::parseInt)
                .collect(toList());
    }
}
