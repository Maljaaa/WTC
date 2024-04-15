package christmas.model.event;

import static christmas.model.event.utils.Badge.*;
import static christmas.model.event.utils.EventPriceStandard.*;

public class EventBadge {

    private String badge;

    public void setBadge(int eventPrice) {
        if(eventPrice < STAR_PRICE.getPrice()) {
            badge = "";
        }
        if(eventPrice >= STAR_PRICE.getPrice() && eventPrice < TREE_PRICE.getPrice()) {
            badge = STAR.getBadge();
        }
        if(eventPrice >= TREE_PRICE.getPrice() && eventPrice < SANTA_PRICE.getPrice()) {
            badge = TREE.getBadge();
        }
        if(eventPrice > SANTA_PRICE.getPrice()) {
            badge = SANTA.getBadge();
        }
    }

    public String getBadge() {
        return badge;
    }
}
