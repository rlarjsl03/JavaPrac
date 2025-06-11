package Week_10_Prac.ConsTest;

class Cons3 {
    public int num;
    public Cons3(String s) {
        System.out.println(s + " 명시적 생성자"); // 명시적 생성자 선언
    }
}

public class ConsTest3 {
    public static void main(String[] args) {
        Cons3 cons1 = new Cons3("1번째"); // 1번째 명시적 생성자
        //Cons3 cons2 = new Cons3();    // 오류 발생, 생성자가 없음
    }
}
