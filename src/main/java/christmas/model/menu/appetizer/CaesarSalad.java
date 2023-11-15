package christmas.model.menu.appetizer;

import static christmas.model.menu.MenuName.CAESAR_SALAD;
import static christmas.model.menu.MenuPrice.CAESAR_SALAD_PRICE;

public class CaesarSalad {

    private final String name = CAESAR_SALAD.getMenu();
    private final int price = CAESAR_SALAD_PRICE.getPrice();
    private int count;

    public CaesarSalad() {
        this.count++;
    }
}
