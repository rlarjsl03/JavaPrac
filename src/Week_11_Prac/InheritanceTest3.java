package Week_11_Prac;

class C1 {
    private static int x = 100; // 클래스 내에서만 변경 가능
    public static int y = x;    // 다른 패키지에서 상속되어도 사용 가능
    static int z = x;
    public static int cc() { return x; }
}
class C2 extends C1 {
    public static String x;
    static int y;   // C1에서 받아온 x 값이 private이므로 초기값인 y==0
}
public class InheritanceTest3 {
    public static void main(String[] args) {
        System.out.println("클래스 메소드 C1.cc() 값 : " + C1.cc());   // 100, C1의 x 값 출력
        System.out.println("클래스 변수 C1.y 값 : " + C1.y);  // 100, class 내부에서 정의 되어있기 때문에 x 값과 같음
        System.out.println("클래스 변수 C1.z 값 : " + C1.z);  // 100, class 내부에서 정의 되어있기 때문에 x 값과 같음
        System.out.println("클래스 변수 C2.x 값 : " + C2.x);  // null, C2의 x 값은 현재 null
        System.out.println("클래스 변수 C2.y 값 : " + C2.y);  // 0, C2의 y 값은 class가 다르기 때문에 C1에서 상속된 y 값을 받지 못함
        System.out.println("클래스 변수 C2.z 값 : " + C2.z);  // 100, C1에서 상속받은 z을 출력하는 것은 가능(변경은 불가능)
        System.out.println("클래스 메소드 C2.cc() 값 : " + C2.cc());   // 100, 똑같이 출력은 가능
        C2.x = "처음 시작하는 자바";
        C2.y = 200;
        C1.z = 300; // C2.z - 300; 도 가능
        System.out.println("클래스 변수 C2.x 값 : " + C2.x);  // 처음 시작하는 자바, C2에 새로 입력된 값이 출력
        System.out.println("클래스 변수 C2.y 값 : " + C2.y);  // 200, C2에 새로 입력 받은 값 출력
        System.out.println("클래스 변수 C2.x 값 : " + C2.z);  // 300, C2.z에 300을 넣어도 C1의 z 값에 300 저장됨
    }
}
