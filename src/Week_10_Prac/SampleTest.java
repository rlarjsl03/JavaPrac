package Week_10_Prac;

class Sample3 {
    void methodA() {
        System.out.println("before B method call");
        methodB();
        System.out.println("after B method call");
    }
    void methodB() {
        System.out.println("before C method call");
        methodC();
        System.out.println("after C method call");
    }
    void methodC() {
        System.out.println("C method runned");

    }
}


public class SampleTest {
    public static void main(String[] args) {
        Sample3 s = new Sample3();
        s.methodA();
    }
}
