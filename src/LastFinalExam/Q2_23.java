package LastFinalExam;


import java.util.Arrays;
import java.util.Scanner;

class Multi {
    int[] arr1;
    int[] arr2;
    int hap;

    public Multi(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
    int Cul () {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            hap += arr1[i] * arr2[i];
        }
        return hap;
    }
}
public class Q2_23 {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        // 각 한 개의 숫자를 뽑아 두 수를 곱하기(중복 x)
        Scanner input = new Scanner(System.in);
        // 랜덤 숫자 뽑기
        System.out.print("Array length: ");
        int length = input.nextInt();
        if (length > 8 || length < 0) {
            System.out.println("Invalid length");
            return;
        }
        arr1 = new int[length];
        arr2 = new int[length];
        Multi m = new Multi(arr1, arr2);

        for (int i = 0; i < length; i++) {
            arr1[i] = (int)(Math.random()*8);
            arr2[i] = (int)(Math.random()*8);
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println(m.Cul());
    }
}