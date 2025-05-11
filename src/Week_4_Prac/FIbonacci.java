
public class FIbonacci {
    public static void main(String[] args) {
        System.out.print("0,1,");
        int n1 = 0, n2 = 1, sum = 1;
        for (int i = 1; i <= 100; i++){
           System.out.print(sum + ",");
           sum = n1 + n2;
           n1 = n2;
           n2 = sum;
        }
    }
}