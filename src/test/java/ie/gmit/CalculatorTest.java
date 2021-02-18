package ie.gmit;

public class CalculatorTest {
    int a = 5;
    int b = 5;
    Calculator c1 = new Calculator(a, b);


    void addTest(){
      c1.add();
    }
    void subtractTest(){
        c1.subtract();
    }
    void multiplyTest(){
        c1.multiply();
    }
    void divideTest(){
        c1.divide();
    }

    void addWithParamTest(){
        c1.add(a, b);
    }
    void subtractWithParamTest(){
        c1.subtract(a, b);
    }
    void multiplyWithParamTest(){
        c1.multiply(a, b);
    }
    void divideWithParamTest(){
        c1.divide(a, b);
    }

}
