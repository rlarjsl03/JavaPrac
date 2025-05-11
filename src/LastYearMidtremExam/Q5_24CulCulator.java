package LastYearMidtremExam;

import java.util.Scanner;

public class Q5_24CulCulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: "); // 거스름돈 계산
        int amount = input.nextInt();

        int[] coins = {1, 10, 50, 100, 160};   // coin 종류를 나타낼 int 배열
        int[] count = new int[amount + 1];  // coin이 분류될 수 있는 모든 경우의 수를 저장하기 위한 배열

        for (int i = 0; i <= amount; i++) { // count 배열에 최대값을 넣음
            count[i] = amount + 1;
        }
        count[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    int cand = count[i - coin] + 1;
                    if (cand < count[i]) {
                        count[i] = cand;
                    }
                }
            }
        }
        if (count[amount] == amount + 1) {
            System.out.println("No solution.");
        } else {
            System.out.println("Minimum number of coins needed: " + count[amount]);
        }


        System.out.println("Mininum number of coins needed: ");
    }
}
