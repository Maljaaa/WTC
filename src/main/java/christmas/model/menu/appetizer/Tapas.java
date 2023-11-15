package christmas.model.menu.appetizer;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class Tapas {

    private final String name = TAPAS.getMenu();
    private final int price = TAPAS_PRICE.getPrice();
    private int count;

    public Tapas(int count) {
        this.count = count;
    }
}
