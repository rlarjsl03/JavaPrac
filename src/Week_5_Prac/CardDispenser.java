public class CardDispenser {
    public static void main(String[] args) {
        String[] c1 = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] c2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < 5; i++){
            int a = (int)(Math.random()*c1.length);
            int b = (int)(Math.random()*c2.length);
            System.out.println(c1[a] + "의 " + c2[b]);
        }
    }
}