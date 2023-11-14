package christmas.model.menu.beverage;

import static christmas.model.menu.menuName.*;
import static christmas.model.menu.menuPrice.*;

public class CokeZero {

    private final String name = COKE_ZERO.getMenu();
    private final int price = COKE_ZERO_PRICE.getPrice();
    private int count;

    public CokeZero(int count) {
        this.count = count;
    }
}
