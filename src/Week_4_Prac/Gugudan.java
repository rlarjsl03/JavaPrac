public class Gugudan {
    public static void main(String args[]) {
        ii: for (int i = 1; i <= 9; i++)
        {
            jj: for (int j = 1; j <= 9; j++){
                if (i < 3) continue jj; {
                    System.out.print(i + "x" + j + "=" + (i*j) + " ");
                }
            }


        }
    }
}