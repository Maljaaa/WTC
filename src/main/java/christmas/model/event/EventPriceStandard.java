package christmas.model.event;

public enum EventPriceStandard {
    EVENT_PRICE(2023),
    D_DAY_PRICE(1000),
    SPECIAL_PRICE(1000),
    GIVEAWAY_PRICE(120000);

    private int price;

    EventPriceStandard(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
