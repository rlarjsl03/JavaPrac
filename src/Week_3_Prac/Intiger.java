package Week_3_Prac;

import java.util.Scanner;

public class Intiger {
    public static void main(String[] args) {
        String twopart = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                twopart = "0" + twopart;
            } else {
                n = n / 2;
                twopart = "1" + twopart;
            }
            if (n <= 0)
                break;
        }
        System.out.println(twopart);
    }
}
