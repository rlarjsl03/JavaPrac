package LastFinalExam.P3;
import java.util.Random;

public class Board {
    private int[][] board;
    private Random ran;
    private int row;
    private int col;
    public Board(int row, int col) {
        this.row = row;
        this.col = col;
        this.board = new int[row][col];
        this.ran = new Random();
    }

    public void setting() {
        int pair = (row * col) / 2;
        for (int i = 1; i <= pair; i++) {
            place(i);
            place(i);
        }
    }
    private void place(int n) {
        for (;;) {
            int i = ran.nextInt(row);
            int j = ran.nextInt(col);
            if (board[i][j] == 0) {
                board[i][j] = n;
                break;
            }
        }
    }
    public void show(int[][] display) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (display[i][j] == 0) System.out.print("X ");
                else System.out.print(display[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void showSolution() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public boolean match(int[] p1, int[] p2) { return board[p1[0]][p1[1]] == board[p2[0]][p2[1]]; }
    public int getVal(int[] p) { return board[p[0]][p[1]]; }
    public boolean win(int[][] display) {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (display[i][j] == 0) return false;
            }
        }
        return true;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
}
