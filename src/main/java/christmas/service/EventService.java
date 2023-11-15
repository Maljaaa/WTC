package christmas.service;

import christmas.model.menu.MenuResult;

import java.util.Arrays;
import java.util.List;

import static christmas.model.menu.MenuName.*;
import static java.util.stream.Collectors.*;

public class EventService {

    public List<String> getMenuName(String order) {

        List<String> menu = Arrays.stream(order.split(","))
                .map(s -> s.substring(0, s.indexOf('-')))
                .collect(toList());

        setMenuResult(menu);

        return menu;
    }

    private void setMenuResult(List<String> menu) {
        MenuResult menuResult = new MenuResult();

        for (String food : menu) {
            isAppetizer(menuResult, food);
            isBeverage(menuResult, food);
            isDesert(menuResult, food);
            isMain(menuResult, food);
        }
    }

    private void isMain(MenuResult menuResult, String food) {
        if (food.equals(BARBECUED_RIBS.getMenu()) || food.equals(CHRISTMAS_PASTA.getMenu()) || food.equals(SEAFOOD_PASTA.getMenu()) || food.equals(T_BONE_STEAK.getMenu())) {
            menuResult.addMainCount();
        }
    }

    private void isDesert(MenuResult menuResult, String food) {
        if (food.equals(CHOCO_CAKE.getMenu()) || food.equals(ICECREAM.getMenu())) {
            menuResult.addDesertCount();
        }
    }

    private void isBeverage(MenuResult menuResult, String food) {
        if (food.equals(CHAMPAGNE.getMenu()) || food.equals(COKE_ZERO.getMenu()) || food.equals(RED_WINE.getMenu())) {
            menuResult.addBeverageCount();
        }
    }

    private void isAppetizer(MenuResult menuResult, String food) {
        if (food.equals(CAESAR_SALAD.getMenu()) || food.equals(MUSHROOM_SOUP.getMenu()) || food.equals(TAPAS.getMenu())) {
            menuResult.addAppetizerCount();
        }
    }

    public List<Integer> getMenuCount(String order) {
        return Arrays.stream(order.split(","))
                .map(s -> s.substring(s.indexOf('-') + 1))
                .map(Integer::parseInt)
                .collect(toList());
    }

}
