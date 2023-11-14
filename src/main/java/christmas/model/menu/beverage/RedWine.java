package christmas.model.menu.beverage;

import static christmas.model.menu.menuName.*;
import static christmas.model.menu.menuPrice.*;

public class RedWine {

    private final String name = RED_WINE.getMenu();
    private final int price = RED_WINE_PRICE.getPrice();
    private int count;

    public RedWine(int count) {
        this.count = count;
    }
}
