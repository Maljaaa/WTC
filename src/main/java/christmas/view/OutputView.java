package christmas.view;

import java.util.List;

import static christmas.view.Format.*;
import static christmas.view.Price.*;
import static christmas.view.Show.*;

public class OutputView {

    public void printHello() {
        System.out.println(PRINT_HELLO.getMessage());
    }

    public void printEventPreview(int date) {
        System.out.println("12월 " + date + "일" + PRINT_EVENT_PREVIEW.getMessage());
    }

    public void printOrderMenu(List<String> menu, List<Integer> count) {
        System.out.println(PRINT_ORDER_MENU);
        for (String food : menu) {
            System.out.println(food + " " + count + COUNT.getFormat());
        }
    }

    public void printAllPrice(int allPrice) {
        System.out.println(PRINT_ALL_PRICE.getMessage());
        System.out.println(allPrice + WON.getFormat());
    }

    public void printGiveawayMenu(int allPrice) {
        System.out.println(PRINT_GIVEAWAY_MENU.getMessage());

        if (allPrice >= GIVEAWAY_PRICE.getPrice()) {
            System.out.println(PRINT_CHAMPAGNE.getMessage());
        }

        if (allPrice < GIVEAWAY_PRICE.getPrice()) {
            System.out.println(PRINT_NOTHING.getMessage());
        }
    }

    public void printBenefitDetails(List<String> benefits, List<Integer> price) {
        System.out.println(PRINT_BENEFIT_DETAILS);

        if (!benefits.isEmpty()) {
            for (String benefit : benefits) {
                System.out.println(benefit + COLON.getFormat() + MINUS.getFormat() + price + WON.getFormat());
            }
        }
        if (benefits.isEmpty()) {
            System.out.println(PRINT_NOTHING);
        }
    }

    public void printAllBenefitsPrice(int price) {
        System.out.println(PRINT_ALL_BENEFITS_PRICE.getMessage());

        if (price > ZERO.getPrice()) {
            System.out.println(MINUS.getFormat() + price + WON.getFormat());
        }
        if (price == ZERO.getPrice()) {
            System.out.println(ZERO.getPrice() + WON.getFormat());
        }
    }

    public void printAmountOfPayment(int price) {
        System.out.println(PRINT_AMOUNT_OF_PAYMENT.getMessage());

        System.out.println(price + WON.getFormat());
    }

    public void printBadge(String badge) {
        System.out.println(PRINT_BADGE.getMessage());

        if (!badge.equals("")) {
            System.out.println(badge);
        }

        if (badge.equals("")) {
            System.out.println(PRINT_NOTHING);
        }
    }
}
