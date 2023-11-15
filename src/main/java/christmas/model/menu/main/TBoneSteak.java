package christmas.model.menu.main;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class TBoneSteak {

    private final String name = T_BONE_STEAK.getMenu();
    private final int price = T_BONE_STEAK_PRICE.getPrice();
    private int count;

    public TBoneSteak(int count) {
        this.count = count;
    }
}
