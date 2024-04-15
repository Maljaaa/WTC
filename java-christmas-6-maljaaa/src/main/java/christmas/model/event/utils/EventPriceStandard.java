package christmas.model.event.utils;

public enum EventPriceStandard {
    EVENT_PRICE(2023),
    D_DAY_PRICE(1000),
    SPECIAL_PRICE(1000),
    GIVEAWAY_PRICE(120000),
    POSSIBLE_PRICE(10000),
    STAR_PRICE(5000),
    TREE_PRICE(10000),
    SANTA_PRICE(20000);

    private int price;

    EventPriceStandard(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
