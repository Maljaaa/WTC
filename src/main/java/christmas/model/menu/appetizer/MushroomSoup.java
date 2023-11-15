package christmas.model.menu.appetizer;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class MushroomSoup {

    private final String name = MUSHROOM_SOUP.getMenu();
    private final int price = MUSHROOM_SOUP_PRICE.getPrice();
    private int count;

    public MushroomSoup() {
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
