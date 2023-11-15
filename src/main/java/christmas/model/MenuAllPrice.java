package christmas.model;

public class MenuAllPrice {

    private int allPrice;

    public void addPayment(int price) {
        allPrice += price;
    }

    public int getAllPrice() {
        return allPrice;
    }
}
