package LastFinalExam.P2;

public class Fish extends GameObject{
    private int cnt;
    int move;

    public Fish(int x, int y, int distance) {
        super(x, y, distance);
        this.cnt = 0;
        this.move = 7;
    }

    @Override
    protected void move() {
        move = (int)(Math.random()*5);
        if (move == 0 || move == 1) {
            cnt = 0;
            while(cnt != distance){
                cnt++;
                int d = (int)(Math.random()*4);
                switch(d) {
                    case 0:
                        x --;
                        if (x<0) x=0;
                        break;
                    case 1:
                        x ++;
                        if (x>= Game.MAX_X) x = Game.MAX_X - 1;
                        break;
                    case 2:
                        y--;
                        if(y<0) y = 0;
                        break;
                    case 3:
                        y++;
                        if(y>=Game.MAX_Y) y = Game.MAX_Y -1;
                        break;
                }
            }
            if (cnt == distance) {
                cnt = 0;
            }
        }
    }

    @Override
    protected char getShape() {
        return '@';
    }
}

