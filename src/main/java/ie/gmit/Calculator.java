package ie.gmit;

public class Calculator {
    int firstNum;
    int secondNum;

    Calculator(int f, int s){
        this.firstNum = f;
        this.secondNum = s;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
}
