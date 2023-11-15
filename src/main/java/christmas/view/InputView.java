package christmas.view;

import java.util.List;

public class InputView {
    private InputDate inputDate;
    private InputOrder inputOrder;

    public InputView() {
        this.inputDate = new InputDate();
        this.inputOrder = new InputOrder();
    }

    public String readDate() {
        return inputDate.readDate();
    }

    public String readOrder() {
        return inputOrder.readOrder();
    }

    public List<String> getMenuName(String order) {
        return inputOrder.getMenuName(order);
    }

    public List<Integer> getMenuCount(String order) {
        return inputOrder.getMenuCount(order);
    }
}
