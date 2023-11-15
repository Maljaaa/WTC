package christmas.service;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;
import christmas.model.event.EventPrice;

import java.util.ArrayList;
import java.util.List;

import static christmas.model.event.utils.EventPriceStandard.*;
import static christmas.service.utils.Benfits.*;

public class EventService {

    public boolean isPossibleEvent() {
        MenuAllPrice menuAllPrice = MenuAllPrice.getInstance();
        MenuCount menuCount = MenuCount.getInstance();

        if (menuAllPrice.getAllPrice() < POSSIBLE_PRICE.getPrice()) {
            return false;
        }

        if (menuCount.getAppetizerCount() + menuCount.getDesertCount() + menuCount.getMainCount() == 0) {
            return false;
        }

        return true;
    }

    public List<String> getBenefits() {
        EventPrice eventPrice = EventPrice.getInstance();
        List<String> benefits = new ArrayList<>();

        isDdayBenefit(eventPrice, benefits);
        isWeekdayBenefit(eventPrice, benefits);
        isHolidayBenefit(eventPrice, benefits);
        isSpecialBenefit(eventPrice, benefits);
        isGiveAwayBenefit(eventPrice, benefits);
        return benefits;
    }

    private void isDdayBenefit(EventPrice eventPrice, List<String> benefits) {
        if(eventPrice.getdDayEventPrice() != 0) {
            benefits.add(D_DAY.getBenefit());
        }
    }

    private void isWeekdayBenefit(EventPrice eventPrice, List<String> benefits) {
        if(eventPrice.getWeekdayEventPrice() != 0) {
            benefits.add(WEEKDAY.getBenefit());
        }
    }

    private void isHolidayBenefit(EventPrice eventPrice, List<String> benefits) {
        if(eventPrice.getHolidayEventPrice() != 0) {
            benefits.add(HOLIDAY.getBenefit());
        }
    }

    private void isSpecialBenefit(EventPrice eventPrice, List<String> benefits) {
        if(eventPrice.getSpecialEventPrice() != 0) {
            benefits.add(SPECIAL.getBenefit());
        }
    }

    private void isGiveAwayBenefit(EventPrice eventPrice, List<String> benefits) {
        if(eventPrice.getGiveAwayEventPrice() != 0) {
            benefits.add(GIVE_AWAY.getBenefit());
        }
    }

    public List<Integer> getBenefitsPrices() {
        EventPrice eventPrice = EventPrice.getInstance();
        List<Integer> price = new ArrayList<>();

        isDdayBenefitPrice(eventPrice, price);
        isWeekdayBenefitPrice(eventPrice, price);
        isHolidayBenefitPrice(eventPrice, price);
        isSpecialBenefitPrice(eventPrice, price);
        isGiveAwayBenefitPrice(eventPrice, price);

        return price;
    }

    private void isDdayBenefitPrice(EventPrice eventPrice, List<Integer> price) {
        if(eventPrice.getdDayEventPrice() != 0) {
            price.add(eventPrice.getdDayEventPrice());
        }
    }

    private void isWeekdayBenefitPrice(EventPrice eventPrice, List<Integer> price) {
        if(eventPrice.getWeekdayEventPrice() != 0) {
            price.add(eventPrice.getWeekdayEventPrice());
        }
    }

    private void isHolidayBenefitPrice(EventPrice eventPrice, List<Integer> price) {
        if(eventPrice.getHolidayEventPrice() != 0) {
            price.add(eventPrice.getHolidayEventPrice());
        }
    }

    private void isSpecialBenefitPrice(EventPrice eventPrice, List<Integer> price) {
        if(eventPrice.getSpecialEventPrice() != 0) {
            price.add(eventPrice.getSpecialEventPrice());
        }
    }

    private void isGiveAwayBenefitPrice(EventPrice eventPrice, List<Integer> price) {
        if(eventPrice.getGiveAwayEventPrice() != 0) {
            price.add(eventPrice.getGiveAwayEventPrice());
        }
    }
}
