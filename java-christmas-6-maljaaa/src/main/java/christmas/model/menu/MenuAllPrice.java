package christmas.model.menu;

public class MenuAllPrice {

    private static MenuAllPrice instance = null;

    private int allPrice;

    private MenuAllPrice() {
    }

    public static MenuAllPrice getInstance() {
        if (instance == null) {
            instance = new MenuAllPrice();
        }
        return instance;
    }

    public void addPayment(int price) {
        allPrice += price;
    }

    public int getAllPrice() {
        return allPrice;
    }
}
