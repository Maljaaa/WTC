package christmas.service;

import christmas.model.MenuAllPrice;
import christmas.model.menu.MenuCount;

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

    public boolean isPossibleEvent() {
        MenuAllPrice menuAllPrice = new MenuAllPrice();
        MenuCount menuCount = new MenuCount();

        if (menuAllPrice.getAllPrice() < 10000) {
            return false;
        }

        if (menuCount.getAppetizerCount() + menuCount.getDesertCount() + menuCount.getMainCount() == 0) {
            return false;
        }

        return true;
    }
}
