package Week_14_Prac;

import java.util.Scanner;

class Day_1 {
    private String work;    // 하루의 할 일을 나타내는 문자열

    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}
public class MonthSchedule_1 {
    Scanner sc = new Scanner(System.in);
    Day_1[] date;

    public MonthSchedule_1(int day) {
        date = new Day_1[day];
    }

    public void input() {
        System.out.print("날짜(1~30)? ");
        int daysel = sc.nextInt();
        daysel--;
        date[daysel] = new Day_1();
        System.out.print("할일? ");
        String work = sc.next();
        date[daysel].set(work);
    }
    public void view() {
        System.out.print("날짜(1~30)? ");
        int daysel2 = sc.nextInt();
        daysel2--;
        date[daysel2].show();
    }
    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }
    public void run() { //스케줄 관리 프로그램 실행
        System.out.println("이번달 스케줄 관리 프로그램.");
        while(true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
            int menu = sc.nextInt();
            switch(menu) {
                case 1: input(); break;
                case 2: view(); break;
                case 3: finish(); return;
                default:
                    System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        MonthSchedule_1 april = new MonthSchedule_1(30);
        april.run();
    }
}