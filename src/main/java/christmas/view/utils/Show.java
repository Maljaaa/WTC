package christmas.view.utils;

public enum Show {
    READ_DATE("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)"),
    READ_ORDER("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)"),

    PRINT_HELLO("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다."),
    PRINT_EVENT_PREVIEW("에 우테코 식당에서 받을 이벤트 혜택 미리 보기!"),
    PRINT_ORDER_MENU("<주문 메뉴>"),
    PRINT_ALL_PRICE("<할인 전 총주문 금액>"),
    PRINT_GIVEAWAY_MENU("<증정 메뉴>"),
    PRINT_CHAMPAGNE("샴페인 1개"),
    PRINT_NOTHING("없음"),
    PRINT_BENEFIT_DETAILS("<혜택 내역>"),
    PRINT_ALL_BENEFITS_PRICE("<총혜택 금액>"),
    PRINT_AMOUNT_OF_PAYMENT("<할인 후 예상 결제 금액>"),
    PRINT_BADGE("<12월 이벤트 배지>");


    private String message;

    Show(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
