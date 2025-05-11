package LastYearMidtremExam;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    int[][] arr1;
    int sum = 0;
    int temp1;
    int temp2;
    public Solution(int[][] arr1) {
        this.arr1 = arr1;
    }

    public int Sum() {
        for (int i = 0; i < arr1[0].length-1; i++) {
            for (int j = 0; j < arr1[0].length-1; j++) {
                if (arr1[0][j] > arr1[0][j+1]) {    // 오름차순
                    temp1 = arr1[0][j];
                    arr1[0][j] = arr1[0][j+1];
                    arr1[0][j+1] = temp1;
                }
                if (arr1[1][j] < arr1[1][j+1]) {
                    temp2 = arr1[1][j];
                    arr1[1][j] = arr1[1][j+1];
                    arr1[1][j+1] = temp2;
                }
            }
        }
        for (int j = 0; j < arr1[0].length; j++) {
            sum += arr1[0][j] * arr1[1][j];
            System.out.println(sum);
        }
        return sum;
    }
}


public class Q4_24RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array and the maximum number : ");
        int a = sc.nextInt();   // 열의 개수 입력
        int b = sc.nextInt();   // 배열에 저장될 최대 수 b 입력
        int[][] arr = new int[2][a];
        System.out.println("Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < a; j++) {
                int RanNum = (int)(Math.random()*b);
                arr[i][j] = RanNum;  //정수형으로 되어있는 RamNum을 문자열로 변경
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Solution solution = new Solution(arr);
        System.out.println("Result: " + solution.Sum());
    }
}
