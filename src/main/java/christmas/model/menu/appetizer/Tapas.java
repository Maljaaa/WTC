package christmas.model.menu.appetizer;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class Tapas {

    private final String name = TAPAS.getMenu();
    private final int price = TAPAS_PRICE.getPrice();
    private int count;

    public Tapas() {
        this.count++;
        addAppetizer();
        addPayment();
    }

    private void addAppetizer() {
        MenuCount menuCount = new MenuCount();
        menuCount.addAppetizerCount();
    }

    private void addPayment() {
        MenuAllPrice menuAllPrice = new MenuAllPrice();
        menuAllPrice.addPayment(price);
    }
}
