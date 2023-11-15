package christmas.controller;

import java.util.List;

import static christmas.view.utils.Price.*;

public class ChristmasController {

    private ViewController viewController;
    private ServiceController serviceController;
    private DomainController domainController;

    public ChristmasController() {
        viewController = new ViewController();
        serviceController = new ServiceController();
        domainController = new DomainController();
    }

    public void run() {
        showHello();

        String date = getDate();
        String order = getOrder();
        List<String> menuName = getMenuName(order);
        List<Integer> menuCount = getMenuCount(order);

        processOrder(menuName, menuCount);
        processEvent(date);

        showEventPreview(date, menuName, menuCount);
    }

    private void showEventPreview(String date, List<String> menuName, List<Integer> menuCount) {
        outputEventPreview(date);
        outputOrderMenu(menuName, menuCount);
        outputAllPrice();
        outputGiveawayMenu();
        outputBenefitDetails();
        outputAllBenefitsPrice();
        outputAmountOfPayment();
        outputBadge();
    }

    private void showHello() {
        viewController.getOutputView().printHello();
    }

    private String getDate() {
        return viewController.getInputView().readDate();
    }

    private String getOrder() {
        String order = viewController.getInputView().readOrder();
        return order;
    }

    private List<String> getMenuName(String order) {
        return viewController.getInputView().getMenuName(order);
    }

    private List<Integer> getMenuCount(String order) {
        return viewController.getInputView().getMenuCount(order);
    }

    private void processOrder(List<String> menuName, List<Integer> menuCount) {
        serviceController.getOrderService().orderMenu(menuName, menuCount);
    }

    private void processEvent(String date) {
        if (serviceController.getEventService().isPossibleEvent()) {
            domainController.getEventCalculator().calculateEvent(date);
        }
    }

    private void outputEventPreview(String date) {
        viewController.getOutputView().printEventPreview(date);
    }

    private void outputOrderMenu(List<String> menuName, List<Integer> menuCount) {
        viewController.getOutputView().printOrderMenu(menuName, menuCount);
    }

    private void outputAllPrice() {
        viewController.getOutputView().printAllPrice(domainController.getMenuAllPrice().getAllPrice());
    }

    private void outputGiveawayMenu() {
        boolean give = domainController.getEventPrice().getGiveAwayEventPrice() != ZERO.getPrice();
        viewController.getOutputView().printGiveawayMenu(give);
    }

    private void outputBenefitDetails() {
        viewController.getOutputView().printBenefitDetails(serviceController.getEventService().getBenefits(), serviceController.getEventService().getBenefitsPrices());
    }

    private void outputAllBenefitsPrice() {
        viewController.getOutputView().printAllBenefitsPrice(domainController.getEventPrice().getAllEventPrice());
    }

    private void outputAmountOfPayment() {
        int paymentAmount = domainController.getMenuAllPrice().getAllPrice() - domainController.getEventPrice().getEventPrice();
        viewController.getOutputView().printAmountOfPayment(paymentAmount);
    }

    private void outputBadge() {
        domainController.getEventBadge().setBadge(domainController.getEventPrice().getAllEventPrice());
        viewController.getOutputView().printBadge(domainController.getEventBadge().getBadge());
    }
}
