package Week_10_Prac.Prac6;

import java.util.Scanner;

public class ConcertApp {
    public static void main(String[] args) {
        String[][] seat= new String [3][10];
        seat[0][0] = "S";
        seat[1][0] = "A";
        seat[2][0] = "B";

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                seat[i][j] = "---";
            }
        }

        Scanner sc = new Scanner(System.in);
        int a = 0;

        while (a != 4) {
            System.out.println("명품콘서트홀 예약 시스템입니다.");
            System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >>");
            a = sc.nextInt();
            switch (a) {
                case 1:

                case 2:

                case 3:

                case 4:

            }
        }
    }
}
