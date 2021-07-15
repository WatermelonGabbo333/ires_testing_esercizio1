package it.euris.ires;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("1 + 1 = 2 ---- nome test")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2),"Dovrei avere 3");
    }
    @Test
    @DisplayName("2 - 1 = 1 ---- nome test")
    void minusTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.minus(2, 1),"Dovrei avere 1");
    }

}
