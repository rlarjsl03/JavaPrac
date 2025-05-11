import java.util.Scanner;

public class UpDown {
    public static void main(String[] args){
        int i = 1;
        Scanner stdin = new Scanner(System.in);
        System.out.print("0 <= x < n 사이의 값을 뽑습니다. n 값을 입력하세요: ");
        int n = stdin.nextInt();
        int n1 = (int)(Math.random()*n);

        while (true) {
            System.out.print("정답을 추측하여 보세요: ");
            int m = stdin.nextInt();
            if ((m > n1) && (m <= 100))
                System.out.println("제시한 정수가 정답보다 낮습니다.");
            else if ((m < n1) && (m > 0))
                System.out.println("제시한 정수가 정답보다 높습니다.");
            else {
                System.out.println("축하합니다. 정답: " + n1 + " 시도횟수: " + i);
                break;
            }
            i++;

        }

    }
}
