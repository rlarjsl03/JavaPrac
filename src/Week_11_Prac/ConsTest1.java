package Week_11_Prac;

class Hello {
    String title;
    int value;
    public Hello () {
        title += " World";
    }
    public Hello(int value) {
        new Hello();    //Hello();
        this.value = value;
        title += "hello";
    }
}

public class ConsTest1 {
    public static void main(String[] args) {
        Hello c = new Hello(5);
        System.out.println(c.title);
    }
}
