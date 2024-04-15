package christmas.model.menu.utils;

public enum MenuPrice {
    CAESAR_SALAD_PRICE(8000),
    MUSHROOM_SOUP_PRICE(6000),
    TAPAS_PRICE(5500),
    CHAMPAGNE_PRICE(25000),
    COKE_ZERO_PRICE(3000),
    RED_WINE_PRICE(60000),
    CHOCO_CAKE_PRICE(15000),
    ICECREAM_PRICE(5000),
    BARBECUED_RIBS_PRICE(54000),
    CHRISTMAS_PASTA_PRICE(25000),
    SEAFOOD_PASTA_PRICE(35000),
    T_BONE_STEAK_PRICE(55000);

    private int price;

    MenuPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
