package Week_14_Prac;

import java.util.Scanner;

class Day {
    private String work;    // 하루의 할 일을 나타내는 문자열

    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}
public class MonthSchedule {    // 요건 잘 함
    public static void main(String[] args) {
        Day[] date = new Day[30];
        Scanner sc = new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램.");
        int todo = 0;
        while (todo != 3) {
            System.out.print("할일(입력:1, 보기: 2, 끝내기:3) >> ");
            todo = sc.nextInt();
            switch (todo) {
                case 1:
                    System.out.print("날짜(1~30)? ");
                    int daysel = sc.nextInt();
                    daysel--;
                    date[daysel] = new Day();
                    System.out.print("할일? ");
                    String work = sc.next();
                    date[daysel].set(work);
                    break;
                case 2:
                    System.out.print("날짜(1~30)? ");
                    int daysel2 = sc.nextInt();
                    daysel2--;
                    date[daysel2].show();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }
    }
}
