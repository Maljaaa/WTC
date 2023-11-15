package christmas.model.menu.desert;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.utils.MenuName.*;
import static christmas.model.menu.utils.MenuPrice.*;

public class ChocoCake {

    private final String name = CHOCO_CAKE.getMenu();
    private final int price = CHOCO_CAKE_PRICE.getPrice();
    private int count;

    public ChocoCake() {
        this.count++;
        addDesert();
        addPayment();
    }

    private void addDesert() {
        MenuCount menuCount = MenuCount.getInstance();
        menuCount.addDesertCount();
    }

    private void addPayment() {
        MenuAllPrice menuAllPrice = MenuAllPrice.getInstance();
        menuAllPrice.addPayment(price);
    }
}
