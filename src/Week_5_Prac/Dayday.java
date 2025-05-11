import java.util.Scanner;

public class Dayday {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        char[] day = {'일', '월', '화', '수', '목', '금', '토'};

        while (true) {
            System.out.print("정수를 입력하세요>> ");
            int i = stdin.nextInt();

            if (i <= 0) {
                System.out.println("프로그램을 종료합니다...");
                break;
            } else {
                int result = i % 7;
                System.out.println(day[result]);
            }
        }
    }
}