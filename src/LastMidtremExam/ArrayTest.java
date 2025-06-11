package LastMidtremExam;

public class ArrayTest {
    public static void main(String[] args) {
        String[][] array = new String[5][10];
        int one = 0;
        int two = 0;
        System.out.println(" __________ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < (array[i].length/2); j++) {
                while (true) {
                    int a =  (int) (Math.random() * 3);
                    if (a == 0){
                        array[i][j] = "0";
                        break;
                    }else if (a == 1) {
                        if (one >= 5) continue;
                        array[i][j] = "1";
                        one++;
                        break;
                    }
                }
                System.out.print(array[i][j]);
            }
            for (int j = 5; j < array[i].length; j++) {
                while (true) {
                    int a =  (int) (Math.random() * 3);
                    if (a == 0){
                        array[i][j] = "0";
                        break;
                    }else if (a == 2) {
                        if (two >= 3) continue;
                        array[i][j] = "2";
                        two++;
                        break;
                    }
                }
                System.out.print(array[i][j]);
            }
            System.out.println("|");
        }
        System.out.print(" __________ ");
    }
}
