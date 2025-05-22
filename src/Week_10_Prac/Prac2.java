package Week_10_Prac;

class Max {
    int imax;
    double dmax;

    public int test(int a, int b) {
        max(a, b);
        getImax();
        return imax;
    }
    public double test(double a, double b) {
        max(a, b);
        getDmax();
        return dmax;
    }
    public void max(int a, int b) {
        imax = a > b ? a : b;
    }
    public void max(double a, double b) {
        dmax = a > b ? a : b;
    }
    public int getImax() {
        return imax;
    }
    public double getDmax() {
        return dmax;
    }
}

public class Prac2 {
    public static void main(String[] args) {
        Max mt = new Max();
        int r = mt.test(4,6);
        double r1 = mt.test(4.2,6.1);
        System.out.println("두 정수 중 큰 값은 " + r);
        System.out.println("두 실수 중 큰 값은 " + r1);
    }
}
