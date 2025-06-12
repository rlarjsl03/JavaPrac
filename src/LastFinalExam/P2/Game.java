package LastFinalExam.P2;


public class Game {
    static final int MAX_X = 10;
    static final int MAX_Y = 7;

    public static void main(String[] args) {
        Bear b = new Bear(0, 0, 1);
        Hunter h = new Hunter(9, 6, 2);

        int fx = (int)(Math.random()*10);
        int fy = (int)(Math.random()*7);
        Fish f = new Fish(fx, fy, 2);

        System.out.println("**Bear/Fish/Hunter Game Start.**");
        while(!b.Collide(f) && !h.Collide(b)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 10; j++) {
                    if(b.getX() == j && b.getY() == i) System.out.print(b.getShape());
                    else if(h.getX() == j && h.getY() == i) System.out.print(h.getShape());
                    else if(f.getX() == j && f.getY() == i) System.out.print(f.getShape());
                    else System.out.print("-");
                }
                System.out.println();
            }
            b.move();
            h.move();
            f.move();
        }

        if (b.Collide(f)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 10; j++) {
                    if(b.getX() == j && b.getY() == i) System.out.print(b.getShape());
                    else if(h.getX() == j && h.getY() == i) System.out.print(h.getShape());
                    else System.out.print("-");
                }
                System.out.println();
            }
            System.out.println("Bears Wins!!");
        }
        else if (h.Collide(b)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 10; j++) {
                    if(f.getX() == j && f.getY() == i) System.out.print(f.getShape());
                    else if(h.getX() == j && h.getY() == i) System.out.print(h.getShape());
                    else System.out.print("-");
                }
                System.out.println();
            }
            System.out.println("Hunter Wins!!");
        }
    }
}

