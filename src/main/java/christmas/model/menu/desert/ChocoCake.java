package christmas.model.menu.desert;

import static christmas.model.menu.menuName.*;
import static christmas.model.menu.menuPrice.*;

public class ChocoCake {

    private final String name = CHOCO_CAKE.getMenu();
    private final int price = CHOCO_CAKE_PRICE.getPrice();
    private int count;

    public ChocoCake(int count) {
        this.count = count;
    }
}
