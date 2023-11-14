package christmas.model.menu.main;

import static christmas.model.menu.menuName.*;
import static christmas.model.menu.menuPrice.*;

public class BarbecuedRibs {

    private final String name = BARBECUED_RIBS.getMenu();
    private final int price = BARBECUED_RIBS_PRICE.getPrice();
    private int count;

    public BarbecuedRibs(int count) {
        this.count = count;
    }
}
