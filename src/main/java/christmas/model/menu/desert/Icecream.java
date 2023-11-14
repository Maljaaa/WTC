package christmas.model.menu.desert;

import static christmas.model.menu.menuName.*;
import static christmas.model.menu.menuPrice.*;

public class Icecream {

    private final String name = ICECREAM.getMenu();
    private final int price = ICECREAM_PRICE.getPrice();
    private int count;

    public Icecream(int count) {
        this.count = count;
    }
}
