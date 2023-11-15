package christmas.model.menu;

public enum MenuName {
    CAESAR_SALAD("시저샐러드"),
    MUSHROOM_SOUP("양송이수프"),
    TAPAS("타파스"),
    CHAMPAGNE("샴페인"),
    COKE_ZERO("제로콜라"),
    RED_WINE("레드와인"),
    CHOCO_CAKE("초코케이크"),
    ICECREAM("아이스크림"),
    BARBECUED_RIBS("바비큐립"),
    CHRISTMAS_PASTA("크리스마스파스타"),
    SEAFOOD_PASTA("해산물파스타"),
    T_BONE_STEAK("티본스테이크");

    private String menu;

    MenuName(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}
