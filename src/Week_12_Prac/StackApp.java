package Week_12_Prac;

import java.util.Scanner;

interface Stack {
    int length();   // 현재 스택에 저장된 개수 리턴
    int capacity(); //스택의 전체 저장 가능한 개수 리턴
    boolean push(String val);   // 스택의 톱(top)에 실수 저장
    String pop();   //스택의 톱(top)에 저장될 실수 리턴
}
class StringStack implements Stack {
    private String[] elements;  //스택의 저장 메모리
    int len;
    int cap;
    void setcap(int cap) {
        this.cap = cap;
    }
    void setlen(int len) {
        this.len = len;
    }
    public int length() {
        return len;
    }
    public int capacity() {
        return cap;
    }
    public boolean push(String val) {
        if (capacity() == length()) {
            return true;
        } else {
            System.out.println("스택이 꽉 차서 푸시 불가!");
            return false;
        }

    }
    public String pop() {
        return null;
    }
}

public class StackApp {
    public static void main(String[] args) {
        StringStack s = new StringStack();
        Scanner sc = new Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int cap = sc.nextInt();
        s.setcap(cap);
        String[] str = new String[s.capacity()];

        while (true) {
            System.out.print("문자열 입력 >> ");
            String val = sc.next();
//            if (s.push(val) == true) {
//                str[]
//            }
        }
    }
}
