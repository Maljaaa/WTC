package christmas.view;

public enum Format {
    NUMBER("-?\\d+"),
    COUNT("개"),
    WON("원"),
    MINUS("-"),
    COLON(": ");
    private String format;

    Format(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
