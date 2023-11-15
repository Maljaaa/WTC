package christmas.view.output;

import java.text.NumberFormat;
import java.util.List;
import java.util.stream.IntStream;

import static christmas.view.utils.Format.*;
import static christmas.view.utils.Price.*;
import static christmas.view.utils.Show.*;

public class OutputView {

    private static final NumberFormat numberFormat = NumberFormat.getInstance();

    public void printHello() {
        printMessage(PRINT_HELLO.getMessage());
    }

    public void printEventPreview(String date) {
        System.out.println("12월 " + date + "일" + PRINT_EVENT_PREVIEW.getMessage());
    }

    public void printOrderMenu(List<String> menu, List<Integer> count) {
        printMessage(PRINT_ORDER_MENU.getMessage());

        IntStream.range(0, menu.size())
                .mapToObj(i -> menu.get(i) + " " + count.get(i) + COUNT.getFormat())
                .forEach(System.out::println);
    }

    public void printAllPrice(int allPrice) {
        printMessage(PRINT_ALL_PRICE.getMessage());
        printPrice(allPrice);
    }

    public void printGiveawayMenu(boolean give) {
        printMessage(PRINT_GIVEAWAY_MENU.getMessage());

        if (give) {
            System.out.println(PRINT_CHAMPAGNE.getMessage());
        }

        if (!give) {
            System.out.println(PRINT_NOTHING.getMessage());
        }
    }

    public void printBenefitDetails(List<String> benefits, List<Integer> prices) {
        printMessage(PRINT_BENEFIT_DETAILS.getMessage());

        IntStream.range(0, benefits.size())
                .mapToObj(i -> benefits.get(i) + COLON.getFormat() + MINUS.getFormat() + numberFormat.format(prices.get(i)) + WON.getFormat())
                .forEach(System.out::println);

        if (benefits.isEmpty()) {
            System.out.println(PRINT_NOTHING.getMessage());
        }
    }

    public void printAllBenefitsPrice(int price) {
        printMessage(PRINT_ALL_BENEFITS_PRICE.getMessage());

        if (price > ZERO.getPrice()) {
            String formattedPrice = numberFormat.format(price);
            System.out.println(MINUS.getFormat() + formattedPrice + WON.getFormat());
        }
        if (price == ZERO.getPrice()) {
            System.out.println(ZERO.getPrice() + WON.getFormat());
        }
    }

    public void printAmountOfPayment(int price) {
        printMessage(PRINT_AMOUNT_OF_PAYMENT.getMessage());
        printPrice(price);
    }

    public void printBadge(String badge) {
        printMessage(PRINT_BADGE.getMessage());

        if (!badge.equals("")) {
            System.out.println(badge);
        }

        if (badge.equals("")) {
            System.out.println(PRINT_NOTHING.getMessage());
        }
    }

    private void printMessage(String message) {
        System.out.println();
        System.out.println(message);
    }

    private void printPrice(int price) {
        System.out.println(formatPrice(price) + WON.getFormat());
    }

    private String formatPrice(int price) {
        return numberFormat.format(price);
    }
}
