package Week_14_Prac;

import java.util.Scanner;

class Day_1 {

}
public class MonthSchedule_1 {
    Scanner sc = new Scanner(System.in);
    private String work;    // 하루의 할 일을 나타내는 문자열

    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
    public void input() {

    }
    public void view() {

    }
    public void finish() {

    }

    public void run() { //스케줄 관리 프로그램 실행
        System.out.println("이번달 스케줄 관리 프로그램.");
        while(true) {
            System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
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
//        MonthSchedule_1 april = new MonthSchedule_1(30);
//        april.run();
    }
}