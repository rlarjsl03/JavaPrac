package Week_12_Prac;

import java.util.Scanner;

public abstract class Calc {    // 추상 클래스
    protected int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract int Calculate(String c); // 추상 메소드, 서브 클래스에서 적절히 구현
}
class Calc1 extends Calc {
    public int Calculate(String c) {
        return switch (c) {
            case "+" -> a + b;  // Add class 만들기
            case "-" -> a - b;  //
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
    public int getValue() {
        return a + b;
    }
}


class CalcTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc1 c1 = new Calc1();
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.nextLine();
        c1.setValue(a, b);
        System.out.println(c1.Calculate(c));
    }
}

