package LastMidtremExam;

import java.util.Scanner;

public class Q3_24ArrayTestRe {
    public static void main(String[] args) {
        String[][] array = new String[5][10];
        Scanner input = new Scanner(System.in);
        int one = 0;
        int two = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "0";
            }
        }
        while (one < 5) {
            int row = (int) (Math.random() * 5);
            int col = (int) (Math.random() * 5);
            if (array[row][col].equals("0")) {
                array[row][col] = "1";
                one++;
            }
        }
        while (two < 3) {
            int row = (int) (Math.random() * 5);
            int col = (int) (Math.random() * 5) + 5;
            if (array[row][col].equals("0")) {
                array[row][col] = "2";
                two++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
