package Week_11_Prac;

class A {
    private int i;
    protected char c;
    public int f;
    private void testA() {
        i = 3;      //1
        c = 'a';    //2
        f = 1;      //3
    }
}
class B extends A {
    int j;
    void testB() {
        j = 6;
        //i = 9;
        c = 'k';
        f = 89;
    }
}

public class Prac1 {
    public static void main(String[] args) {
        B b = new B();
        b.testB();
    }
}
