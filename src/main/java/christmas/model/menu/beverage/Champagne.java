package christmas.model.menu.beverage;

import static christmas.model.menu.menuName.*;
import static christmas.model.menu.menuPrice.*;

public class Champagne {

    private final String name = CHAMPAGNE.getMenu();
    private final int price = CHAMPAGNE_PRICE.getPrice();
    private int count;

    public Champagne(int count) {
        this.count = count;
    }
}
