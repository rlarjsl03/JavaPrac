package LastFinalExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_24 {
    public static void histogram(ArrayList<String> alphabet) {
        int[] counts = new int[26];

        for (String s : alphabet) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                    counts[s.charAt(j) - 'A']++; // 아스키 코드 값을 a만큼 빼면, 각 인덱스에 하나씩 저장 가능
                } else if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                    counts[s.charAt(j) - 'a']++;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.print((char) ('A' + i));
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayList<String> sentence = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        // A greedy algorithm is any algorithm that follows the problem-solving heuristic of making the "locally" optimal choice at each "stage". In many problems, a greedy strategy does not produce an optimal solution, but a greedy heuristic can yield "locally" optimal solutions that approximate a globally optimal solution in a reasonable amount of time
        while (true) {
            String str = sc.nextLine();
            if (str.equals(";")) {
                break;
            }
            sentence.add(str);
        }
        histogram(sentence);
    }
}
