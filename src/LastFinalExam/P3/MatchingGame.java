package LastFinalExam.P3;

import java.util.Scanner;

public class MatchingGame {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** Number Matching Game ***");
        System.out.println("* Input game size (row, col)");
        System.out.println("* Note: (row*col must be even, row>0, col>0)");
        System.out.print("Enter row and col: ");

        int row = 0, col = 0;

        for (;;) {
            row = sc.nextInt();
            col = sc.nextInt();

            if (row > 0 && col > 0 && (row * col) % 2 == 0) {
                break;
            } else {
                System.out.print("Re-enter row and col: ");
            }
        }

        Board b = new Board(row, col);
        b.setting();
        System.out.println("Game start");
        System.out.println("* Solution *");
        b.showSolution();
        System.out.println();

        int[][] display = new int[row][col];
        play(b, display);
    }

    private static int[] getCard(String order, int row, int col) {
        System.out.print("Enter " + order + " card position (row col): ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        if (isVal(rows, cols, row, col)) return new int[]{ rows, cols };
        else
        {
            System.out.println("Position out of range. Try again.");
            return null;
        }
    }
    private static boolean isVal(int rows, int cols, int row, int col) {return rows >= 0 && rows < row && cols >= 0 && cols < col;}
    private static void play(Board b, int[][] display) {
        for (;;)
        {
            b.show(display);
            int[] p1 = getCard("first", b.getRow(), b.getCol());
            if (p1 == null) continue;
            int[] p2 = getCard("second", b.getRow(), b.getCol());
            if (p2 == null) continue;
            if (b.match(p1, p2))
            {
                display[p1[0]][p1[1]] = b.getVal(p1);
                display[p2[0]][p2[1]] = b.getVal(p2);
                System.out.println("Match found!");
            }
            else System.out.println("No match. Try again.");
            if (b.win(display))
            {
                b.show(display);
                System.out.println("Congratulations! You've matched all the cards!");
                break;
            }
        }
    }
}

