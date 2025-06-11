package Week_11_Prac;

class DB1 {
    public double d1;
    public DB1() {
        System.out.println("클래스 DB1의 묵시정 생성자 수행");
        d1 = 10*10;
    }
}
class DB2 extends DB1 {
    public double d2;
    public DB2() {  // 묵시적 생성자
        System.out.println("클래스 DB2의 묵시적 생성자 수행");
        d2 = 10*10*10;
    }
    public DB2(double d) {  // 명시적 생성자
        System.out.println("클래스 DB2의 명시적 생성자 수행");
        d2 = d*d*d;
    }
}
class DB3 extends DB2 {
    public double d3;
    public DB3() {
        System.out.println("클래스 Db3의 묵시적 생성자 수행");
        d3 = 10*10*10*10;
    }
    public DB3(double d) {
        System.out.println("클래스 DB3의 명시적(매개변수 1개) 생성자 수행");
        d3 = d*d*d*d;
    }
}
public class DefaultInheritanceTest2 {
    public static void main(String[] args) {
        DB3 super1 = new DB3(11);   // DB3은 DB1, DB2를 상속 하므로 d1, d2, d3 모두 생성 가능
        System.out.println("10의 2제곱 : " + super1.d1);
        System.out.println("10의 3제곱 : " + super1.d2);
        System.out.println("10의 4제곱 : " + super1.d3);
    }
}

//class AAA {
//    static public void aa(int a, int b) { // 클래스 메소드 선언
//        System.out.println(a+b);
//    }
//}
//class BBB extends AAA {
//    public void aa(int a, int b) {  // 일반 메소드로 클래스 메소드를 오버라이딩 하는 경우, 오류 발생(static을 붙혀야 함)
//        System.out.println(a*b);
//    }
//}



