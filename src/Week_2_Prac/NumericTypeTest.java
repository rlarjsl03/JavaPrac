import java.util.Scanner;

public class NumericTypeTest {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int i1 = stdIn.nextInt();
        int i2 = stdIn.nextInt();
        int i3 = i1 - i2;
        System.out.println(i1 + " - " + i2 + " = " + i3);
    }
}
