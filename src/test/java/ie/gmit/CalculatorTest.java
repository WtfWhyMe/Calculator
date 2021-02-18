package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    int a = 5;
    int b = 5;
    Calculator c1 = new Calculator(a, b);

    @Test
    void addTest(){
     int result = c1.add();
     assertEquals(10, result, 0);
    }
    @Test
    void subtractTest(){
        int result = c1.subtract();
        assertEquals(0, result, 0);
    }
    @Test
    void multiplyTest(){
        int result = c1.multiply();
        assertEquals(25, result, 0);
    }
    @Test
    void divideTest(){
        int result = c1.divide();
        assertEquals(1, result, 0);

    }
    @Test
    void addWithParamTest(){
        int result = c1.add(a, b);
        assertEquals(10, result, 0);
    }
    @Test
    void subtractWithParamTest(){
        int result = c1.subtract(a, b);
        assertEquals(0, result, 0);
    }
    @Test
    void multiplyWithParamTest(){
        int result = c1.multiply(a, b);
        assertEquals(25, result, 0);
    }
    @Test
    void divideWithParamTest(){
        int result = c1.divide(a, b);
        assertEquals(1, result, 0);
    }

}
