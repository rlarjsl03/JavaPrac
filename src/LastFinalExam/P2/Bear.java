package LastFinalExam.P2;
import java.util.Scanner;

public class Bear extends GameObject {
    private Scanner sc = null;
    public Bear(int x, int y, int distance) {
        super(x, y, distance);
        sc = new Scanner(System.in);
    }

    @Override
    public void move() {
        System.out.print("Left(a), Down(s), Up(w), Right(d) >> ");
        char c;
        c = sc.next().charAt(0);
        switch (c)
        {
            case 'a':
                x -= distance;
                if (x<0) x=0;
                break;
            case 'd':
                x += distance;
                if (x>= Game.MAX_X) x = Game.MAX_X - 1;
                break;
            case 'w':
                y -= distance;
                if(y<0) y = 0;
                break;
            case 's':
                y += distance;
                if(y>=Game.MAX_Y) y = Game.MAX_Y -1;
                break;
        }
    }

    @Override
    public char getShape() {
        return 'B';
    }
}

