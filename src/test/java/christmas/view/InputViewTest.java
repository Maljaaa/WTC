package christmas.view;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class InputViewTest {

    private InputView inputView;
    private final InputStream originalInputStream = System.in;

    @BeforeEach
    public void setUp() {
        inputView = new InputView();
        String expectedNumber = "25\nabc\n";
        System.setIn(new ByteArrayInputStream(expectedNumber.getBytes()));
    }

    @AfterEach
    public void tearDown() {
        System.setIn(originalInputStream);
    }

    @DisplayName("입력으로 숫자가 들어오면 통과")
    @Order(1)
    @Test
    public void validInputTest() {
        //given
        int expectedNumber = 25;
        //when
        int actualNumber = inputView.readDate();
        //then
        assertEquals(expectedNumber, actualNumber);
        System.setIn(originalInputStream);
    }

    @DisplayName("입력으로 숫자가 들어오지 않으면 에러 발생 후 통과")
    @Order(2)
    @Test
    public void invalidInputTest() throws Exception {
        //given
        //when & then
        assertThrows(IllegalArgumentException.class, () -> inputView.readDate());
        System.setIn(originalInputStream);
    }

}