package Week_9_Prac;

import java.util.Scanner;

class SafeArray {
    private int a[];
    public int length;

    public SafeArray(int length) {
        this.length = length;
        a = new int[length];
    }
    public int get(int index) {
        return a[index];
    }
    public void set(int index, int value) {
        if (index >= length){
            System.out.println("잘못된 인덱스 " + index);
        }else
            a[index] = value;
    }
}

public class Prac3 {
    public static void main(String[] args) {
        SafeArray sa = new SafeArray(3);
        sa.set(0, 1);
        System.out.println(sa.get(0));
        sa.set(1, 2);
        System.out.println(sa.get(1));
        sa.set(2, 3);
        System.out.println(sa.get(2));
        sa.set(300, 3);
    }
}
