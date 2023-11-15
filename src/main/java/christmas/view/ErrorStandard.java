package christmas.view;

public enum ErrorStandard {
    MAX_ORDER_COUNT(20),
    MIN_ORDER_COUNT(0);

    private int number;

    ErrorStandard(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
