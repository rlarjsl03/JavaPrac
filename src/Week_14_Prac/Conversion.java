package Week_14_Prac;

import java.util.Objects;
import java.util.Scanner;

class String_S {
    String[] s;
    String[] ss = new String[30];
    int stack0 = 0;
    int stack1 = 0;
    String_S(String[] m) {
        for (int i = 0; i < m.length; i++) {
            if (s != null) {
                s[i] = m[i];
            }
        }
    }
    String[] getS() {
        return s;
    }
    void convert() {
        int n = 0;
        for (int i = 0; i < ss.length; i++) {
            for (int j = n; j < s.length; j++) {
                if ((j > 0) && !s[j].equals(s[j - 1])) {
                    if (s[j-1].equals("0")) stack0++;
                    else if (s[j-1].equals("1")) stack1++;
                    n = j;
                    break;
                }
                ss[j] = s[i];
            }
            if (n == s.length) break;
        }if (stack0 > stack1) System.out.println("result = " + stack1);
        else System.out.println("result = " + stack0);
    }
}


public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        String_S s1 = new String_S(s);
        s1.convert();
    }
}
