package christmas.model.menu.desert;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class Icecream {

    private final String name = ICECREAM.getMenu();
    private final int price = ICECREAM_PRICE.getPrice();
    private int count;

    public Icecream() {
        this.count++;
    }
}
