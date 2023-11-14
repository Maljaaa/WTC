package christmas.model.menu.main;

import static christmas.model.menu.menuName.*;
import static christmas.model.menu.menuPrice.*;

public class ChristmasPasta {

    private final String name = CHRISTMAS_PASTA.getMenu();
    private final int price = CHRISTMAS_PASTA_PRICE.getPrice();
    private int count;

    public ChristmasPasta(int count) {
        this.count = count;
    }
}
