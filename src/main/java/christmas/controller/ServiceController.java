package christmas.controller;

import christmas.service.EventService;
import christmas.service.OrderService;

public class ServiceController {

    private EventService eventService;
    private OrderService orderService;

    public ServiceController() {
        eventService = new EventService();
        orderService = new OrderService();
    }

    public EventService getEventService() {
        return eventService;
    }

    public OrderService getOrderService() {
        return orderService;
    }
}
