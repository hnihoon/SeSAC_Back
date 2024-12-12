//6.두 정수를 활용하여 이항연산을 할 수 있는 계산기 클래스를 구현하시오

package day241212_class;

public class class_calculate {
    public static void main(String[] args) {
        Calc calc = new Calc();

        calc.calculate(10,10,'+');
        calc.calculate(10,10,'-');
        calc.calculate(10,10,'*');
        calc.calculate(10,10,'/');
    }
}

class Calc{
    int num1 = 0;
    int num2 = 0;
    char operator = ' ';
    int sum = 0;

    public String toString() {
        return num1 + " " + operator + " " + num2 +" = " + sum;
    }

    //1)계산을 위한 메서드
    public void calculate(int num1, int num2, char operator){
        this.num1 = num1;
        this.num2 = num1;
        this.operator = operator;

        switch (operator){
            case '+': sum = num1 + num2;
                break;
            case '-': sum = num1 - num2;
                break;
            case '*': sum = num1 * num2;
                break;
            case '/': sum = num1 / num2;
                break;
        }
        System.out.println(this.toString());
    }


}
