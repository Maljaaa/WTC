package christmas.model.menu.desert;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.utils.MenuName.*;
import static christmas.model.menu.utils.MenuPrice.*;

public class Icecream {

    private final String name = ICECREAM.getMenu();
    private final int price = ICECREAM_PRICE.getPrice();
    private int count;

    public Icecream() {
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
