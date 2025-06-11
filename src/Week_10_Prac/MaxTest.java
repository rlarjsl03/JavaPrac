package Week_10_Prac;

public class MaxTest {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.print("두 수 중 큰 값은 (" + a + "," + b + ") : " + max(a,b));
    }
}
