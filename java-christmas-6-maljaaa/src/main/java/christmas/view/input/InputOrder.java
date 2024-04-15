package christmas.view.input;

import christmas.model.menu.utils.MenuName;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.view.utils.Error.INVALID_ORDER;
import static christmas.view.utils.ErrorStandard.MAX_ORDER_COUNT;
import static christmas.view.utils.ErrorStandard.MIN_ORDER_COUNT;
import static christmas.view.utils.Show.READ_ORDER;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class InputOrder {

    private Set<String> availableMenus;

    private Set<String> beverageMenus;

    public InputOrder() {
        availableMenus = getAvailableMenus();
        beverageMenus = Set.of("샴페인", "제로콜라", "레드와인");
    }

    private Set<String> getAvailableMenus() {
        return Arrays.stream(MenuName.values())
                .map(MenuName::getMenu)
                .collect(toSet());
    }

    public String readOrder() {
        while (true) {
            try {
                return requestOrderInput();
            } catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
                printInvalidOrderMessage();
            }
        }
    }

    private String requestOrderInput() {
        System.out.println(READ_ORDER.getMessage());
        String order = readLine();
        validateOrder(order);
        return order;
    }

    private void validateOrder(String order) {
        List<String> orders = getMenuName(order);
        validateOnlyBeverage(orders);
        validateAvailable(orders);
        validateDuplicate(orders);

        List<Integer> ordersCount = getMenuCount(order);
        validateMinCount(ordersCount);
        validateMaxCount(ordersCount);
    }

    public List<String> getMenuName(String order) {
        return Arrays.stream(order.split(","))
                .map(s -> s.substring(0, s.indexOf('-')))
                .collect(toList());
    }

    private void validateOnlyBeverage(List<String> orders) {
        boolean cantOrder = beverageMenus.containsAll(orders);
        if (cantOrder) {
            throw new IllegalArgumentException();
        }
    }

    private void validateAvailable(List<String> orders) {
        for (String menu : orders) {
            if (!availableMenus.contains(menu)) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateDuplicate(List<String> orders) {
        Set<String> uniqueOrders = new HashSet<>(orders);
        if (uniqueOrders.size() < orders.size()) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getMenuCount(String order) {
        return Arrays.stream(order.split(","))
                .map(s -> s.substring(s.indexOf('-') + 1))
                .map(Integer::parseInt)
                .collect(toList());
    }

    private void validateMinCount(List<Integer> ordersCount) {
        for (Integer orderCount : ordersCount) {
            if (orderCount <= MIN_ORDER_COUNT.getNumber()) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateMaxCount(List<Integer> ordersCount) {
        if (ordersCount.stream()
                .mapToInt(Integer::intValue)
                .sum() > MAX_ORDER_COUNT.getNumber()) {
            throw new IllegalArgumentException();
        }
    }

    private void printInvalidOrderMessage() {
        System.out.println(INVALID_ORDER.getMessage());
    }
}
