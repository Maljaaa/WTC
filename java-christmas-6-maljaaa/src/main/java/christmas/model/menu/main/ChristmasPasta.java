package christmas.model.menu.main;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.utils.MenuName.*;
import static christmas.model.menu.utils.MenuPrice.*;

public class ChristmasPasta {

    private final String name = CHRISTMAS_PASTA.getMenu();
    private final int price = CHRISTMAS_PASTA_PRICE.getPrice();
    private int count;

    public ChristmasPasta() {
        this.count++;
        addMain();
        addPayment();
    }

    private void addMain() {
        MenuCount menuCount = MenuCount.getInstance();
        menuCount.addMainCount();
    }

    private void addPayment() {
        MenuAllPrice menuAllPrice = MenuAllPrice.getInstance();
        menuAllPrice.addPayment(price);
    }
}
