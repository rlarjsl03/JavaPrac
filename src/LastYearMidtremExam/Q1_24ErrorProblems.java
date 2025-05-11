package LastYearMidtremExam;

import java.util.Scanner;

public class Q1_24ErrorProblems {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        // Public = 모든 클래스에 접근이 가능한 접근 제한자
        // Protected = 자식 클래스가 아닌 다른 패키지에 소속된 클래스에서 접근이 불가능한 접근 제한자
        // Private = 모든 외부 클래스에서 접근이 불가능한 접근 제한자
        String[][] arr = {{"JVM", "자바 프로그램이 실행되는 컴퓨터, Java Virtual Machine의 약어"},   //1 p.42
                {"Syntax Error", "컴파일 시간에 발생하는 구문 오류"}, //2-1 p.40
                {"Runtime Error", "실행 시 발생하는 실행시간 오류"},
                {"Login Error", "논리적 문제로 발생하는 논리 오류"},
                {"상속", "확장의 개념으로 상위 클래스를 그대로 상속받고 추가로 확장되는 개념"},    //6-1 p.14
                {"캡슐화", "데이터와 그 데이터를 다루는 메서드를 하나로 묶는 것"},   //6-1 p.18
                {"추상화", "복잡한 문제들 중에 공통적인 부분을 추출하여 추상 클래스로 제공하고, 상속을 이용하여 나머지 클래스들을 하위 클래스로 제공하는 기법(메소드를 사용하는 것"},   //6-1 p.23
                {"다형성", "서로 다른 객체가 동일한 메시지에 대하여 서로 다른 방법으로 응답할 수 있는 기능"},   // 6-1 p.26
        }; //배열 등록

        while (true) {
            System.out.print("Enter the number of problems (-1 for exit): ");   // 숫자 입력받음
            int num = stdin.nextInt();

            if (num == -1) { //-1이면 break로 구문 종료
                System.out.println("End");
                break;
            } else if (num < -1 || num > 8) {
                System.out.println("Wrong input");
                continue;
            } //틀린구문이면 다시 continue로 while문의 처음으로 돌아감

            boolean[] check = new boolean[8]; // boolean 배열로 중복 체크
                                              // 사용된 인덱스를 true로 처리 하는 방법

            for (int i = 0; i < num; ) {
                int rand = (int) (Math.random() * 8); // 랜덤 출력을 위해 난수 생성

                if (!check[rand]) { // 해당 인덱스가 이미 사용되었는지 확인
                    check[rand] = true; // 사용되었다고 표시
                    System.out.printf("%-15s\t%s\n", arr[rand][0], arr[rand][1]); //-15s로 출력
                    i++; // i의 증가는 여기서 처리
                }
            }
        }
    }
}
