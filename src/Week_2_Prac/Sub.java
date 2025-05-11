package Week_2_Prac;

import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " - " + b + " = " + (a - b));
    }
}
