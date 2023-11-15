package christmas.model.menu.desert;

import christmas.model.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

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
        MenuCount menuCount = new MenuCount();
        menuCount.addDesertCount();
    }

    private void addPayment() {
        MenuAllPrice menuAllPrice = new MenuAllPrice();
        menuAllPrice.addPayment(price);
    }
}
