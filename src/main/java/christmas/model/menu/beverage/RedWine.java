package christmas.model.menu.beverage;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class RedWine {

    private final String name = RED_WINE.getMenu();
    private final int price = RED_WINE_PRICE.getPrice();
    private int count;

    public RedWine() {
        this.count++;
        addBeverage();
        addPayment();
    }

    private void addBeverage() {
        MenuCount menuCount = MenuCount.getInstance();
        menuCount.addBeverageCount();
    }

    private void addPayment() {
        MenuAllPrice menuAllPrice = MenuAllPrice.getInstance();
        menuAllPrice.addPayment(price);
    }
}
