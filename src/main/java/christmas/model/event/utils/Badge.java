package christmas.model.event.utils;

public enum Badge {
    STAR("별"),
    TREE("트리"),
    SANTA("산타");

    private String badge;

    Badge(String badge) {
        this.badge = badge;
    }

    public String getBadge() {
        return badge;
    }
}
