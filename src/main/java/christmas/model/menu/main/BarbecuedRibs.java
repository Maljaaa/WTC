package christmas.model.menu.main;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class BarbecuedRibs {

    private final String name = BARBECUED_RIBS.getMenu();
    private final int price = BARBECUED_RIBS_PRICE.getPrice();
    private int count;

    public BarbecuedRibs() {
        this.count++;
        addMain();
        addPayment();
    }

    private void addMain() {
        MenuCount menuCount = new MenuCount();
        menuCount.addMainCount();
    }

    private void addPayment() {
        MenuAllPrice menuAllPrice = new MenuAllPrice();
        menuAllPrice.addPayment(price);
    }
}
