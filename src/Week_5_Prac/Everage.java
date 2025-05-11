import java.util.Scanner;
import java.util.StringTokenizer;

public class Everage {
    public static void main(String[] args) {
        String[][] a;
        a = new String[6][12];
        a[0] = new String[]{"학생1", " ", "1", "3", "2", "4", "3", "1", "4", "2", "2", "1"};
        a[1] = new String[]{"학생2", " ", "3", "2", "4", "2", "2", "1", "1", "3", "4", "1"};
        a[2] = new String[]{"학생3", " ", "2", "4", "3", "2", "1", "2", "1", "3", "3", "4"};
        a[3] = new String[]{"학생4", " ", "2", "4", "3", "2", "1", "2", "1", "3", "3", "4"};
        a[4] = new String[]{"학생5", " ", "3", "1", "1", "2", "4", "1", "2", "3", "1", "3"};
        a[5] = new String[]{"정답", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] score;
        score = new String[5];
        for (int i = 0; i < a.length; i++) {
            int k;
            for(k = 0; k<a[i].length; k++){
                System.out.print(a[i][k]);;
            }
            System.out.println();
        }

        Scanner stdin = new Scanner(System.in);
        System.out.print("정답을 입력하세요(10개): ");
        String b = stdin.nextLine();
        StringTokenizer st = new StringTokenizer(b);

        for (int i = 0; i < a.length; i++) {
            int num = 0;
            for (int k = 2; k < a[i].length; k++) {
                if (a[5][i] == a[1][k])
                    num++;
                System.out.println(num);
            }
        }

    }
}
