package christmas.service;

import christmas.model.menu.MenuAllPrice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static christmas.model.menu.utils.MenuPrice.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    private OrderService orderService;

    @BeforeEach
    public void setup() {
        orderService = new OrderService();
    }

    @DisplayName("주문 후 전체 가격 확인 테스트")
    @Test
    public void allPriceTest() throws Exception {
        List<String> menu = Arrays.asList("티본스테이크", "바비큐립", "초코케이크", "제로콜라");
        List<Integer> menuCount = Arrays.asList(1, 1, 2, 1);
        orderService.orderMenu(menu, menuCount);

        int expectedAllPrice = T_BONE_STEAK_PRICE.getPrice() +
                BARBECUED_RIBS_PRICE.getPrice() +
                (CHOCO_CAKE_PRICE.getPrice() * 2) +
                COKE_ZERO_PRICE.getPrice();
        assertEquals(expectedAllPrice, MenuAllPrice.getInstance().getAllPrice());
    } 

}