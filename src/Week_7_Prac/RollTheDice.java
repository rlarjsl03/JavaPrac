package Week_7_Prac;

class Dice {
    int d1;
    int d2;
    int num;

    public void RollDice() {
        while (true) {
            num++;
            d1 = (int) (Math.random() * 6) + 1;
            d2 = (int) (Math.random() * 6) + 1;
            System.out.println("주사위1= " + d1 + "\t주사위2= " + d2);
            if (d1 + d2 == 2) {
                System.out.println("(" + d1 + "," + d2 + ")이 나오는 데 걸린 횟수 = " + num);
                break;
            }
        }
    }
}

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.RollDice();
    }
}
