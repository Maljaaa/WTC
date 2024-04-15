package christmas.service.utils;

public enum Benfits {
    D_DAY("크리스마스 디데이 할인"),
    WEEKDAY("평일 할인"),
    HOLIDAY("주말 할인"),
    SPECIAL("특별 할인"),
    GIVE_AWAY("증정 이벤트");

    private String benefit;

    Benfits(String benefit) {
        this.benefit = benefit;
    }

    public String getBenefit() {
        return benefit;
    }
}
