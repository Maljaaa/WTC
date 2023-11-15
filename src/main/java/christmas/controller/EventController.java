package christmas.controller;

import christmas.model.event.EventCalculator;
import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuEventPrice;
import christmas.service.EventService;
import christmas.service.OrderService;
import christmas.view.InputView;
import christmas.view.OutputView;

import java.util.List;

public class EventController {

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    EventService eventService = new EventService();
    OrderService orderService = new OrderService();
    EventCalculator eventCalculator = new EventCalculator();
    MenuAllPrice menuAllPrice = new MenuAllPrice();
    MenuEventPrice menuEventPrice = new MenuEventPrice();

    public void run() {
        outputView.printHello();
        String date = inputView.readDate();
        String order = inputView.readOrder();
        List<String> menuName = eventService.getMenuName(order);
        List<Integer> menuCount = eventService.getMenuCount(order);
        orderService.orderMenu(menuName);
        if (eventService.isPossibleEvent()) {
            eventCalculator.calculateEvent(date);
        }
        outputView.printEventPreview(date);
        outputView.printOrderMenu(menuName, menuCount);
        outputView.printAllPrice(menuAllPrice.getAllPrice());
        boolean give = false;
        if (menuEventPrice.getSpecialEventPrice() != 0) {
            give = true;
        }
        outputView.printGiveawayMenu(give);
        outputView.printBenefitDetails(eventService.getBenefits(), eventService.getBenefitsPrice());
    }
}
