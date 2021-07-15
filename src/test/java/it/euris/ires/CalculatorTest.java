package it.euris.ires;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("1 + 1 = 2 ---- nome test")
    void addsTwoNumbers() {
        assertEquals(3, calculator.add(1, 2),"Dovrei avere 3");
    }
    @Test
    @DisplayName("2 - 1 = 1 ---- nome test")
    void minusTwoNumbers() {
        assertEquals(1, calculator.minus(2, 1),"Dovrei avere 1");
    }

    @Test
    @DisplayName("2 * 1 = 2 ---- nome test")
    void multiplyTwoNumbers() {
        //arrange
        int a =2;
        int b =1;
        int expectedResult = 2;
        //act
        int result = calculator.per(2, 1);
        //assert
        assertEquals(expectedResult, result,String.format("%d * %d dovrei ottenere %d",a,b,expectedResult));
    }

    @Test
    @DisplayName("2 / 1 = 2 ---- nome test")
    void divideTwoNumbers() {
        //arrange
        int a =2;
        int b =1;
        int expectedResult = 2;
        //act
        int result = calculator.diviso(2, 1);
        //assert
        assertEquals(expectedResult, result,String.format("%d / %d dovrei ottenere %d",a,b,expectedResult));
    }



}
