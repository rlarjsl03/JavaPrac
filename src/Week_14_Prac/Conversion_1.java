package Week_14_Prac;

import java.util.Scanner;

public class Conversion_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numStr = scan.next();
        int count[] = {0,0};

        count[numStr.charAt(0) - '0']++;

        for (int i =1; i <numStr.length(); i++) {
            if (numStr.charAt(i) != numStr.charAt(i-1)) count[numStr.charAt(i) - '0']++;
        }
        System.out.println("count[0]: " + count[0] + " count[1]: " + count[1]);
        System.out.println("result = " + Math.min(count[0], count[1]));
    }
}
