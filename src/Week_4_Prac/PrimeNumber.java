public class PrimeNumber {
    public static void main(String[] args){
        int n = 2;
        while(n <= 100) {
            boolean prime = true;
            for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            if(prime == true){
                System.out.print(n);
            }
            n++;
        }
    }
}
