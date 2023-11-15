package christmas.service;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;
import christmas.model.menu.MenuEventPrice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static christmas.service.Benfits.*;
import static java.util.stream.Collectors.*;

public class EventService {

    public List<String> getMenuName(String order) {

        return Arrays.stream(order.split(","))
                .map(s -> s.substring(0, s.indexOf('-')))
                .collect(toList());
    }

    public List<Integer> getMenuCount(String order) {
        return Arrays.stream(order.split(","))
                .map(s -> s.substring(s.indexOf('-') + 1))
                .map(Integer::parseInt)
                .collect(toList());
    }

    public boolean isPossibleEvent() {
        MenuAllPrice menuAllPrice = new MenuAllPrice();
        MenuCount menuCount = new MenuCount();

        if (menuAllPrice.getAllPrice() < 10000) {
            return false;
        }

        if (menuCount.getAppetizerCount() + menuCount.getDesertCount() + menuCount.getMainCount() == 0) {
            return false;
        }

        return true;
    }

    public List<String> getBenefits() {
        MenuEventPrice menuEventPrice = new MenuEventPrice();
        List<String> benefits = new ArrayList<>();

        isDdayBenefit(menuEventPrice, benefits);
        isWeekdayBenefit(menuEventPrice, benefits);
        isHolidayBenefit(menuEventPrice, benefits);
        isSpecialBenefit(menuEventPrice, benefits);
        isGiveAwayBenefit(menuEventPrice, benefits);
        return benefits;
    }

    private void isDdayBenefit(MenuEventPrice menuEventPrice, List<String> benefits) {
        if(menuEventPrice.getdDayEventPrice() != 0) {
            benefits.add(D_DAY.getBenefit());
        }
    }

    private void isWeekdayBenefit(MenuEventPrice menuEventPrice, List<String> benefits) {
        if(menuEventPrice.getWeekdayEventPrice() != 0) {
            benefits.add(WEEKDAY.getBenefit());
        }
    }

    private void isHolidayBenefit(MenuEventPrice menuEventPrice, List<String> benefits) {
        if(menuEventPrice.getHolidayEventPrice() != 0) {
            benefits.add(HOLIDAY.getBenefit());
        }
    }

    private void isSpecialBenefit(MenuEventPrice menuEventPrice, List<String> benefits) {
        if(menuEventPrice.getSpecialEventPrice() != 0) {
            benefits.add(SPECIAL.getBenefit());
        }
    }

    private void isGiveAwayBenefit(MenuEventPrice menuEventPrice, List<String> benefits) {
        if(menuEventPrice.getGiveAwayEventPrice() != 0) {
            benefits.add(GIVE_AWAY.getBenefit());
        }
    }

    public List<Integer> getBenefitsPrice() {
        MenuEventPrice menuEventPrice = new MenuEventPrice();
        List<Integer> price = new ArrayList<>();

        isDdayBenefitPrice(menuEventPrice, price);
        isWeekdayBenefitPrice(menuEventPrice, price);
        isHolidayBenefitPrice(menuEventPrice, price);
        isSpecialBenefitPrice(menuEventPrice, price);
        isGiveAwayBenefitPrice(menuEventPrice, price);

        return price;
    }

    private void isDdayBenefitPrice(MenuEventPrice menuEventPrice, List<Integer> price) {
        if(menuEventPrice.getdDayEventPrice() != 0) {
            price.add(menuEventPrice.getdDayEventPrice());
        }
    }

    private void isWeekdayBenefitPrice(MenuEventPrice menuEventPrice, List<Integer> price) {
        if(menuEventPrice.getWeekdayEventPrice() != 0) {
            price.add(menuEventPrice.getWeekdayEventPrice());
        }
    }

    private void isHolidayBenefitPrice(MenuEventPrice menuEventPrice, List<Integer> price) {
        if(menuEventPrice.getHolidayEventPrice() != 0) {
            price.add(menuEventPrice.getHolidayEventPrice());
        }
    }

    private void isSpecialBenefitPrice(MenuEventPrice menuEventPrice, List<Integer> price) {
        if(menuEventPrice.getSpecialEventPrice() != 0) {
            price.add(menuEventPrice.getSpecialEventPrice());
        }
    }

    private void isGiveAwayBenefitPrice(MenuEventPrice menuEventPrice, List<Integer> price) {
        if(menuEventPrice.getGiveAwayEventPrice() != 0) {
            price.add(menuEventPrice.getGiveAwayEventPrice());
        }
    }
}
