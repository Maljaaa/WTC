package christmas.view;

import christmas.model.menu.MenuName;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.view.Error.*;
import static christmas.view.Format.*;
import static christmas.view.Show.*;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;

public class InputView {

    private Set<String> availableMenus = Arrays.stream(MenuName.values())
            .map(MenuName::getMenu)
            .collect(toSet());

    public String readDate() {
        while (true) {
            try {
                System.out.println(READ_DATE.getMessage());
                String date = readLine();
                validateDate(date);
                return date;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validateDate(String date) {
        if (!date.matches(NUMBER.getFormat())) {
            throw new IllegalArgumentException(INVALID_DATE.getMessage());
        }
        if (Integer.parseInt(date) < 1 || Integer.parseInt(date) > 31) {
            throw new IllegalArgumentException(INVALID_DATE.getMessage());
        }
    }

    public String readOrder() {
        while (true) {
            try {
                System.out.println(READ_ORDER.getMessage());
                String order = readLine();
                validateOrder(order);
                validateOrderCount(order);
                return order;
            } catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
                System.out.println(INVALID_ORDER.getMessage());
            }
        }
    }

    private void validateOrder(String order) {
        List<String> orderedMenus = getMenuName(order);
        for (String menu : orderedMenus) {
            if (!availableMenus.contains(menu)) {
                throw new IllegalArgumentException();
            }
        }
    }

    public List<String> getMenuName(String order) {
        return Arrays.stream(order.split(","))
                .map(s -> s.substring(0, s.indexOf('-')))
                .collect(toList());
    }

    private void validateOrderCount(String order) {
        List<Integer> orderMenusCount = getMenuCount(order);
        for (Integer orderCount : orderMenusCount) {
            if (orderCount <= 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    public List<Integer> getMenuCount(String order) {
        return Arrays.stream(order.split(","))
                .map(s -> s.substring(s.indexOf('-') + 1))
                .map(Integer::parseInt)
                .collect(toList());
    }
}
