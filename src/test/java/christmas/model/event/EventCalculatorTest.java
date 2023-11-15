package christmas.model.event;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;
import christmas.model.menu.appetizer.CaesarSalad;
import christmas.model.menu.beverage.CokeZero;
import christmas.model.menu.desert.ChocoCake;
import christmas.model.menu.main.BarbecuedRibs;
import christmas.model.menu.main.TBoneSteak;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventCalculatorTest {

    private EventCalculator eventCalculator;
    private EventPrice eventPrice;

    @BeforeEach
    public void setup() {
        eventCalculator = new EventCalculator();
        eventPrice = EventPrice.getInstance();

        new TBoneSteak();
        new BarbecuedRibs();
        new ChocoCake();
        new ChocoCake();
        new CokeZero();
    }

    @DisplayName("날짜와 메뉴에 따른 이벤트 계산기 테스트")
    @Test
    public void testCalculateEvent() {
        eventCalculator.calculateEvent("3"); // D-Day, 특별 이벤트, 기프트 이벤트가 적용되는 날짜

        assertEquals(1200, eventPrice.getdDayEventPrice()); // D-Day 이벤트 가격이 올바른지 검증
        assertEquals(4046, eventPrice.getWeekdayEventPrice()); // 주중 이벤트가 적용되아야 함
        assertEquals(0, eventPrice.getHolidayEventPrice()); // 공휴일 이벤트가 적용되지 않아야 함
        assertEquals(1000, eventPrice.getSpecialEventPrice()); // 특별 이벤트 가격이 올바른지 검증
        assertEquals(25000, eventPrice.getGiveAwayEventPrice()); // 기프트 이벤트 가격이 올바른지 검증
    }

}