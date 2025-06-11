package LastMidtremExam;

import java.util.Scanner;

public class Q2_23RockScissorsPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hu_wins = 0;
        int com_wins = 0;
        System.out.print("Enter the number of Rock Paper Scissors: ");
        int a = input.nextInt();
        String[][] list = new String[a+2][4];
        list[0] = new String[]{"Match", "Computer", "Player", "Result"};

        for (int i = 1; i <= a; i++) {
            System.out.print("Rock(0), Paper(1), Scissors(2): ");
            int hu = input.nextInt();
            list[i][0] = Integer.toString(i);
            list[i][2] = Integer.toString(hu);
            int com = (int) (Math.random() * (a-1));
            list[i][1] = Integer.toString(com);

            switch (hu - com)
            {
                case 0:
                    list[i][3] = "Draw";
                    break;
                case 1, -2:
                    list[i][3] = "Player Win";
                    hu_wins++;
                    break;
                case 2, -1:
                    list[i][3] = "Computer Win";
                    com_wins++;
                    break;
            }
        }
        list[a+1] = new String[]{"Total", Integer.toString(hu_wins), Integer.toString(com_wins), "-"};

        for (int i = 0; i < a+2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-10s", list[i][j]);
            }
            System.out.println();
        }
    }
}
