package LastFinalExam.P2;


public class Hunter extends GameObject{
    private int cnt = 0;
    public Hunter(int x, int y, int distance) {
        super(x, y, distance);
    }

    @Override
    public boolean Collide(GameObject p) {
        if(this.x == p.getX() && this.y == p.getY()) return true;
        else return false;
    }
    @Override
    public void move() {
        while(cnt != distance)
        {
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
        if (cnt == distance) cnt = 0;
    }

    @Override
    protected char getShape() {
        return 'H';
    }
}

