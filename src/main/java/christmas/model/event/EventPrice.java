package christmas.model.event;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuEventPrice;

public class EventPrice {

    private int eventPrice;

    public void addEventPrice(int price) {
        this.eventPrice += price;
    }

    public int getEventPrice() {
        return eventPrice;
    }
}
