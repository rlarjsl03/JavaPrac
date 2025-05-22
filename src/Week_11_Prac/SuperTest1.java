package Week_11_Prac;

class SB1 {
    public int x = 500;
    public int y = 1000;
}
class SB2 extends SB1 {
    public String x = "처음 시작하는 자바 ";
    public String xx = x + super.x; // x는 SB2 class에 있는 값, super.x는 SB1 class에서 상속해 온 값 500
    public String yy = "" + y + super.y;    // y는 SB2에서 선언되지 않았기 때문에 SB1에서 상속해 온 값이 super.y와 같음 1000
}
//super은 하위 클래스에 의해 가려진 상위 클래스의 멤버 변수나 메소드에 접근할 때 사용
//두 번째는 상위 클래스에 명시적 생성자를 호출하기 위해 사용
//final을 사용하면 하위 클래스에서 오버라이딩 불가

public class SuperTest1 {
    public static void main(String[] args) {
        SB2 sb2 = new SB2();
        System.out.println("객체 sb2에 들어 있는 x,y 값 : " + sb2.x + sb2.y);
        //sb2.super.x 이와 같은 사용은 허용 x
        System.out.println("객체 sb2에 들어 있는 xx 값 : " + sb2.xx);
        System.out.println("객체 sb2에 들어 있는 yy 값 : " + sb2.yy);
    }
}
