package christmas.model.event;

import christmas.model.menu.MenuAllPrice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventCalculatorTest {

    private EventCalculator eventCalculator;
    private EventPrice eventPrice;

    @BeforeEach
    public void setup() {
        eventCalculator = new EventCalculator();
        eventPrice = EventPrice.getInstance();
    }

    @Test
    public void testCalculateEvent() {
        eventCalculator.calculateEvent("3"); // D-Day, 특별 이벤트, 기프트 이벤트가 적용되는 날짜

        assertEquals(1200, eventPrice.getdDayEventPrice()); // D-Day 이벤트 가격이 올바른지 검증
        assertEquals(4046, eventPrice.getWeekdayEventPrice()); // 주중 이벤트가 적용되아야 함
//        assertEquals(0, eventPrice.getHolidayEventPrice()); // 공휴일 이벤트가 적용되지 않아야 함
//        assertEquals(1000, eventPrice.getSpecialEventPrice()); // 특별 이벤트 가격이 올바른지 검증
//        assertEquals(25000, eventPrice.getGiveAwayEventPrice()); // 기프트 이벤트 가격이 올바른지 검증
    }

}