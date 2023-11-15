package christmas.model.menu.beverage;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class Champagne {

    private final String name = CHAMPAGNE.getMenu();
    private final int price = CHAMPAGNE_PRICE.getPrice();
    private int count;

    public Champagne() {
        this.count++;
        addBeverage();
        addPayment();
    }

    private void addBeverage() {
        MenuCount menuCount = new MenuCount();
        menuCount.addBeverageCount();
    }

    private void addPayment() {
        MenuAllPrice menuAllPrice = MenuAllPrice.getInstance();
        menuAllPrice.addPayment(price);
    }
}
