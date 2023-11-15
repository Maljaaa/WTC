package christmas.model.menu.desert;

import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class ChocoCake {

    private final String name = CHOCO_CAKE.getMenu();
    private final int price = CHOCO_CAKE_PRICE.getPrice();
    private int count;

    public ChocoCake() {
        this.count++;
        addDesert();
    }

    private void addDesert() {
        MenuCount menuCount = new MenuCount();
        menuCount.addDesertCount();
    }
}
