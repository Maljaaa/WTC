package christmas.model.event;

public enum EventPrice {
    EVENT_PRICE(2023),
    D_DAY_PRICE(1000),
    SPECIAL_PRICE(1000),
    GIVEAWAY_PRICE(120000);

    private int price;

    EventPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
