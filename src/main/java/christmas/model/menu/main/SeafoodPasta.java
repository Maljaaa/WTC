package christmas.model.menu.main;

import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class SeafoodPasta {

    private final String name = SEAFOOD_PASTA.getMenu();
    private final int price = SEAFOOD_PASTA_PRICE.getPrice();
    private int count;

    public SeafoodPasta() {
        this.count++;
        addMain();
    }

    private void addMain() {
        MenuCount menuCount = new MenuCount();
        menuCount.addMainCount();
    }
}
