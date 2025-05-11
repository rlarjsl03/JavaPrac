package Week_10;

class Circle0 {
    int x;
    int y;
    int radius;

    public Circle0() {
        x = (int)(Math.random()*100);
        y = (int)(Math.random()*100);
        radius = (int)(Math.random()*100);
    }
    public String toString() {
        return "Circle0 [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }
}


public class Prac4 {
    public static void main(String[] args) {
        Circle0[] c = new Circle0[3];
        c[0] = new Circle0();
        System.out.println(c[0]);
        c[1] = new Circle0();
        System.out.println(c[1]);
        c[2] = new Circle0();
        System.out.println(c[2]);
    }
}
