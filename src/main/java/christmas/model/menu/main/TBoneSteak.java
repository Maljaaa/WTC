package christmas.model.menu.main;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.utils.MenuName.*;
import static christmas.model.menu.utils.MenuPrice.*;

public class TBoneSteak {

    private final String name = T_BONE_STEAK.getMenu();
    private final int price = T_BONE_STEAK_PRICE.getPrice();
    private int count;

    public TBoneSteak() {
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
