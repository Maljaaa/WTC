package christmas.model.menu.main;

import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class TBoneSteak {

    private final String name = T_BONE_STEAK.getMenu();
    private final int price = T_BONE_STEAK_PRICE.getPrice();
    private int count;

    public TBoneSteak() {
        this.count++;
        addMain();
    }

    private void addMain() {
        MenuCount menuCount = new MenuCount();
        menuCount.addMainCount();
    }
}
