package christmas.model.menu.main;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.utils.MenuName.*;
import static christmas.model.menu.utils.MenuPrice.*;

public class SeafoodPasta {

    private final String name = SEAFOOD_PASTA.getMenu();
    private final int price = SEAFOOD_PASTA_PRICE.getPrice();
    private int count;

    public SeafoodPasta() {
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
