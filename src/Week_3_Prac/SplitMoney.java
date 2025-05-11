package Week_3_Prac;

import java.util.Scanner;

public class SplitMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요: ");
        int money = sc.nextInt();
        int man = 0;
        int chon = 0;
        int ohbeak = 0;
        int beak = 0;
        int sip = 0;
        int ill = 0;
        while (money > 0) {
            if (money >= 10000) {
                money -= 10000;
                man++;
            } else if (money >= 1000) {
                money -= 1000;
                chon++;
            } else if (money >= 500) {
                money -= 500;
                ohbeak++;
            } else if (money >=100) {
                money -= 100;
                beak++;
            } else if (money >= 10) {
                money -= 10;
                sip++;
            } else if (money >= 1) {
                money -= 1;
                ill++;
            }
        }
        System.out.println("일만원권: " + man);
        System.out.println("천원권: " + chon);
        System.out.println("오백원주화: " + ohbeak);
        System.out.println("백원주화: " + beak);
        System.out.println("십원주화: " + sip);
        System.out.println("일원주화: " + ill);
    }
}
