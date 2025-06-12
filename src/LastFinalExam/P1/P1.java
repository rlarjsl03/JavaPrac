package LastFinalExam.P1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        //A greedy algorithm is any algorithm that follows the problem-solving heuristic of making the "locally" optimal choice at each "stage". In many problems, a greedy strategy does not produce an optimal solution, but a greedy heuristic can yield "locally" optimal solutions that approximate a globally optimal solution in a reasonable amount of time

        int[] Count = new int[26];
        StringBuilder tx = new StringBuilder();
        for (;;)
        {
            String line = sc.nextLine();
            if (line.equals(";"))
            {
                break;
            }
            tx.append(line);
        }

        for (int i = 0; i < tx.length(); i++)
        {
            char n = tx.charAt(i);
            if (n >= 'a' && n <= 'z') n = (char)(n - 'a' + 'A');
            if (n >= 'A' && n <= 'Z') Count[(n - 'A')]++;

        }
        System.out.println("히스토그램을 그립니다.");

        for (int i = 0; i < 26; i++)
        {
            char let = (char) ('A' + i);
            System.out.print(let + " ");
            for (int j = 0; j < Count[i]; j++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
