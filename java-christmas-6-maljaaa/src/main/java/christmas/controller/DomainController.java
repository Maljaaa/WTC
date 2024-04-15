package christmas.controller;

import christmas.model.event.EventBadge;
import christmas.model.event.EventCalculator;
import christmas.model.event.EventPrice;
import christmas.model.menu.MenuAllPrice;

public class DomainController {

    private EventCalculator eventCalculator;
    private MenuAllPrice menuAllPrice;
    private EventPrice eventPrice;
    private EventBadge eventBadge;

    public DomainController() {
        eventCalculator = new EventCalculator();
        menuAllPrice = MenuAllPrice.getInstance();
        eventPrice = EventPrice.getInstance();
        eventBadge = new EventBadge();
    }

    public EventCalculator getEventCalculator() {
        return eventCalculator;
    }

    public MenuAllPrice getMenuAllPrice() {
        return menuAllPrice;
    }

    public EventPrice getEventPrice() {
        return eventPrice;
    }

    public EventBadge getEventBadge() {
        return eventBadge;
    }
}
