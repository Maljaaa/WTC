package christmas.controller;

import christmas.model.event.EventBadge;
import christmas.model.event.EventCalculator;
import christmas.model.menu.MenuAllPrice;
import christmas.model.event.EventPrice;
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
    MenuAllPrice menuAllPrice = MenuAllPrice.getInstance();
    EventPrice eventPrice = EventPrice.getInstance();
    EventBadge eventBadge = new EventBadge();

    public void run() {
        outputView.printHello();
        String date = inputView.readDate();
        String order = inputView.readOrder();
        List<String> menuName = inputView.getMenuName(order);
        List<Integer> menuCount = inputView.getMenuCount(order);
        orderService.orderMenu(menuName, menuCount);
        if (eventService.isPossibleEvent()) {
            eventCalculator.calculateEvent(date);
        }

        outputView.printEventPreview(date);
        outputView.printOrderMenu(menuName, menuCount);

        outputView.printAllPrice(menuAllPrice.getAllPrice());

        boolean give = eventPrice.getGiveAwayEventPrice() != 0;
        outputView.printGiveawayMenu(give);

        outputView.printBenefitDetails(eventService.getBenefits(), eventService.getBenefitsPrices());

        outputView.printAllBenefitsPrice(eventPrice.getAllEventPrice());

        outputView.printAmountOfPayment(menuAllPrice.getAllPrice() - eventPrice.getEventPrice());
        eventBadge.setBadge(eventPrice.getAllEventPrice());
        outputView.printBadge(eventBadge.getBadge());
    }
}
