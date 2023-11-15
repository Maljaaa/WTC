package christmas.model.event;

public class EventPrice {

    private int eventPrice;

    public void addEventPrice(int price) {
        this.eventPrice += price;
    }

    public int getEventPrice() {
        return eventPrice;
    }
}
