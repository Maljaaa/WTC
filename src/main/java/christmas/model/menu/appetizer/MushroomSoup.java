package christmas.model.menu.appetizer;

import static christmas.model.menu.menuName.*;
import static christmas.model.menu.menuPrice.*;

public class MushroomSoup {

    private final String name = MUSHROOM_SOUP.getMenu();
    private final int price = MUSHROOM_SOUP_PRICE.getPrice();
    private int count;

    public MushroomSoup(int count) {
        this.count = count;
    }
}
