package Week_10_Prac.ConsTest;

class Cons2 {
    public int num;
    public Cons2() {
        System.out.println("묵시적 생성자");
    }
}

public class ConsTest2 {
    public static void main(String[] args) {
        Cons2 cons = new Cons2();
    }
}
