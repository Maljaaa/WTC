package christmas.view.utils;

public enum Price {
    GIVEAWAY_PRICE(120000),
    ZERO(0);

    private int price;

    Price(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
