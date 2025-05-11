import java.util.Scanner;

public class Sigma {
    public static void main(String arg[]){
        Scanner stdin = new Scanner(System.in);
        System.out.print("M : ");
        int M = stdin.nextInt();
        int i = 1, R = 0;
        while (i <= M) {
            R += (i*i + 1);
            i++;
        }
        System.out.println("R = " + R);
    }
}
