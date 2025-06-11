package Week_14_Prac;

import java.util.Arrays;

public class Boat_1 {
    public static int solution(int[] people, int limit) {
        //  제한: 탑승인원 두 명
        Arrays.sort(people);    // 몸무게를 오름차순으로 정렬
        int count = 0;  //구명보트 사용 횟수
        int left = 0;   // 왼쪽 인덱스
        int right = people.length - 1;  // 오른쪽 인덱스

        while (left <= right) {
            // 가장 가벼운 사람과 무거운 사람을 함께 태울 수 있는지 확인
            if (people[left] + people[right] <= limit) {
                left++; //가장 가벼운 사람 탑승
                right--;    // 가장 무거운 사람 탑승
            } else {
                right--;    //가장 무거운 사람 혼자 탑승
            }
            count++;    // 구명보트 사용 횟수 증가
        }

        return count;
    }

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};    // 각 사람의 몸무게
        int limit = 100;    // 구명보트의 무게 제한

        int answer = solution(people, limit);
        System.out.println("구명보트 사용 횟수: " + answer);
    }
}
