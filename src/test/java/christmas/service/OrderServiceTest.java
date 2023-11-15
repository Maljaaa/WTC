package christmas.service;

import christmas.model.menu.MenuAllPrice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    private OrderService orderService;

    @BeforeEach
    public void setup() {
        orderService = new OrderService();
    }

    @Test
    public void allPriceTest() throws Exception {
        List<String> menu = Arrays.asList("티본스테이크", "바비큐립", "초코케이크", "제로콜라");
        List<Integer> menuCount = Arrays.asList(1, 1, 2, 1);
        orderService.orderMenu(menu, menuCount);

        // 여기서 실제 메뉴의 가격을 설정해야 합니다.
        int expectedAllPrice = 55000 + 54000 + 30000 + 3000; // 예시 가격
        assertEquals(expectedAllPrice, MenuAllPrice.getInstance().getAllPrice());
    } 

}