package LastYearMidtremExam;

import java.util.Arrays;

public class RRR {
    public static void main(String[] args) {
        int temp;
        int[] a;
        a = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
