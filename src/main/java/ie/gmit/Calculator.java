package ie.gmit;

public class Calculator {
    int firstNum;
    int secondNum;

    Calculator(int f, int s){
        this.firstNum = f;
        this.secondNum = s;
    }
    Calculator(){
        firstNum = 1;
        secondNum = 1;
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

    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public int add() {
        return firstNum + secondNum;
    }
    public int subtract(){
        return firstNum - secondNum;
    }

    public int multiply(){
        return firstNum * secondNum;
    }

    public int divide(){
        return firstNum / secondNum;
    }

}
