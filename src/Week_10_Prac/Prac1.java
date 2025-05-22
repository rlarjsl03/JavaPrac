package Week_10_Prac;

import java.util.Scanner;

public class Prac1 {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("두 수 중 큰 값은 (" + a + "," + b + ") : " + max(a,b));
    }

}
