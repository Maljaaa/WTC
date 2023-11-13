package christmas.view;

public enum Format {
    NUMBER("-?\\d+");
    private String format;

    Format(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
