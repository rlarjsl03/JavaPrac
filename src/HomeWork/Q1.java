package HomeWork;

import java.util.Scanner;

class WordRelay {
    String[] words;
    int num;

    WordRelay(int num, String a, String b, String c) {
         words = new String[num];
    }


}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("끗말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("참가자의 이름을 입력하세요");
            String a = sc.next();
        }

        WordRelay wr = new WordRelay(num, "a", "b", "c");

    }
}
