package christmas.model.menu.beverage;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class CokeZero {

    private final String name = COKE_ZERO.getMenu();
    private final int price = COKE_ZERO_PRICE.getPrice();
    private int count;

    public CokeZero() {
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
