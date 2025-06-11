package Week_10_Prac;

class Circle0 {
    int x;
    int y;
    int radius;

    public Circle0(int x, int y, int radius) {
//        x = (int)(Math.random()*100);
//        y = (int)(Math.random()*100);
//        radius = (int)(Math.random()*100);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public String toString() {
        return "Circle0 [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }
}


public class CircleTest2 {
    public static void main(String[] args) {
        Circle0[] c = new Circle0[3];
        c[0] = new Circle0(95, 80, 30);
        System.out.println(c[0]);
        c[1] = new Circle0(20, 60, 4);
        System.out.println(c[1]);
        c[2] = new Circle0(7, 95, 82);
        System.out.println(c[2]);
    }
}
