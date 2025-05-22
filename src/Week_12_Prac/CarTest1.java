package Week_12_Prac;

abstract class Car {
    public int speed() {
        return 0;
    }
}
class Sedan extends Car {
    public int speed() {
        return 100;
    }
}
class RaceCar extends Sedan {
    public int speed() {
        return 250;
    }
}
public class CarTest1 {
    public static void main(String[] args) {
        RaceCar rc = new RaceCar();
        Sedan s = new RaceCar();
        Car c = new RaceCar();
        System.out.println(rc.speed());
        System.out.println(s.speed());
        System.out.println(c.speed());
    }
}
