package Week_11_Prac;

class DD1 {
     DD1 () {   //private DD1 () {} private를 사용하면 상속 x
        System.out.println("클래스 DD1의 생성자");
    }
}
class DD2 extends DD1 {
    public DD2 () {
        System.out.println("클래스 DD2의 생성자");
    }
}

public class ClassTest2 {
    public static void main(String[] args) {
        DD2 d = new DD2();
    }
}
