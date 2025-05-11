package Week_10;

class Circle {
    int radius;
    int x;
    int y;

    public Circle (int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void move(Circle c, int x, int y) {
        c.radius = radius;
        c.x += x;
        c.y += y;
    }
    public String toString() {
        return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }
}


public class Prac3 {
    public static void main(String[] args) {

        Circle c = new Circle(10, 10, 5);
        System.out.println("move() 호출 전");
        System.out.println(c);
        c.move(c,10,20);
        System.out.println("move() 호출 후");
        System.out.println(c);
    }
}
