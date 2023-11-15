package christmas.view;

import java.text.NumberFormat;
import java.util.List;
import java.util.stream.IntStream;

import static christmas.view.Format.*;
import static christmas.view.Price.*;
import static christmas.view.Show.*;

public class OutputView {

    public void printHello() {
        System.out.println(PRINT_HELLO.getMessage());
        System.out.println();
    }

    public void printEventPreview(String date) {
        System.out.println("12월 " + date + "일" + PRINT_EVENT_PREVIEW.getMessage());
    }

    public void printOrderMenu(List<String> menu, List<Integer> count) {
        System.out.println();
        System.out.println(PRINT_ORDER_MENU.getMessage());

        IntStream.range(0, menu.size())
                .mapToObj(i -> menu.get(i) + " " + count.get(i) + COUNT.getFormat())
                .forEach(System.out::println);
    }

    public void printAllPrice(int allPrice) {
        System.out.println();
        System.out.println(PRINT_ALL_PRICE.getMessage());

        NumberFormat numberFormat = NumberFormat.getInstance();
        String formattedAllPrice = numberFormat.format(allPrice);
        System.out.println(formattedAllPrice + WON.getFormat());
    }

    public void printGiveawayMenu(boolean give) {
        System.out.println();
        System.out.println(PRINT_GIVEAWAY_MENU.getMessage());

        if (give) {
            System.out.println(PRINT_CHAMPAGNE.getMessage());
        }

        if (!give) {
            System.out.println(PRINT_NOTHING.getMessage());
        }
    }

    public void printBenefitDetails(List<String> benefits, List<Integer> prices) {
        System.out.println();
        System.out.println(PRINT_BENEFIT_DETAILS.getMessage());

        NumberFormat numberFormat = NumberFormat.getInstance();
        IntStream.range(0, benefits.size())
                .mapToObj(i -> benefits.get(i) + COLON.getFormat() + MINUS.getFormat() + numberFormat.format(prices.get(i)) + WON.getFormat())
                .forEach(System.out::println);

        if (benefits.isEmpty()) {
            System.out.println(PRINT_NOTHING.getMessage());
        }
    }

    public void printAllBenefitsPrice(int price) {
        System.out.println();
        System.out.println(PRINT_ALL_BENEFITS_PRICE.getMessage());

        if (price > ZERO.getPrice()) {
            NumberFormat numberFormat = NumberFormat.getInstance();
            String formattedPrice = numberFormat.format(price);
            System.out.println(MINUS.getFormat() + formattedPrice + WON.getFormat());
        }
        if (price == ZERO.getPrice()) {
            System.out.println(ZERO.getPrice() + WON.getFormat());
        }
    }

    public void printAmountOfPayment(int price) {
        System.out.println();
        System.out.println(PRINT_AMOUNT_OF_PAYMENT.getMessage());

        NumberFormat numberFormat = NumberFormat.getInstance();
        String formattedPrice = numberFormat.format(price);
        System.out.println(formattedPrice + WON.getFormat());
    }

    public void printBadge(String badge) {
        System.out.println();
        System.out.println(PRINT_BADGE.getMessage());

        if (!badge.equals("")) {
            System.out.println(badge);
        }

        if (badge.equals("")) {
            System.out.println(PRINT_NOTHING.getMessage());
        }
    }
}
