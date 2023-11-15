package christmas.model.event;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;
import christmas.model.menu.MenuEventPrice;

import static christmas.model.event.EventCalendar.*;
import static christmas.model.event.EventPriceStandard.*;
import static christmas.model.menu.MenuPrice.*;

public class EventCalculator {

    MenuEventPrice menuEventPrice = new MenuEventPrice();
    MenuCount menuCount = new MenuCount();

    public void calculateEvent(String date) {
        isDdayEvent(date);
        isWeekDayEvent(date);
        isHolidayEvent(date);
        isSpecialEvent(date);
        isGiveAwayEvent();
    }

    private void isDdayEvent(String date) {
        if (D_DAY_EVENT.getPeriod()
                .contains(date)) {
            menuEventPrice.setdDayEventPrice(D_DAY_PRICE.getPrice() + (((Integer.parseInt(date) % 25) * 100) - 100));
        }
    }

    private void isWeekDayEvent(String date) {
        if (WEEKDAY_EVENT.getPeriod()
                .contains(date)) {
            menuEventPrice.setWeekdayEventPrice(menuCount.getDesertCount() * EVENT_PRICE.getPrice());
        }
    }

    private void isHolidayEvent(String date) {
        if (HOLIDAY_EVENT.getPeriod()
                .contains(date)) {
            menuEventPrice.setHolidayEventPrice(menuCount.getMainCount() * EVENT_PRICE.getPrice());
        }
    }

    private void isSpecialEvent(String date) {
        if (SPECIAL_EVENT.getPeriod()
                .contains(date)) {
            menuEventPrice.setSpecialEventPrice(SPECIAL_PRICE.getPrice());
        }
    }

    private void isGiveAwayEvent() {
        MenuAllPrice menuAllPrice = new MenuAllPrice();
        if (menuAllPrice.getAllPrice() > GIVEAWAY_PRICE.getPrice()) {
            menuEventPrice.setGiveAwayEventPrice(CHAMPAGNE_PRICE.getPrice());
        }
    }
}
