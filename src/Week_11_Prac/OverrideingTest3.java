package Week_11_Prac;

class OIa {
    public void show(String str) {
        System.out.println("상위 클래스의 메소드 show(String str)수행 : " + str);
    }
}
class OIb extends OIa {
     public void shaw(String str) { // @Override 주석을 이용하여 메소드를 선언하면, 상위 클래스의 오버라이딩 메소드와 일치하지 않아 오류 발생
        System.out.println("하위 클래스의 메소드 show(String str)수행 : " + str);
    }
//    @Override public void shaw(String str) { // 이럼 이제 오류 발생
//        System.out.println("하위 클래스의 메소드 show(String str)수행 : " + str);
//    }
//    @Override public void show(String str) { // 이렇게 써야 오류 안발생
//        System.out.println("하위 클래스의 메소드 show(String str)수행 : " + str);
//    }
}   // @Override 은 오버라이딩된 것이라고 알려주는 것.(주석임)

public class OverrideingTest3 {
    public static void main(String[] args) {
        OIb oib = new OIb();
        oib.show("처음 시작하는 자바");
    }
}
