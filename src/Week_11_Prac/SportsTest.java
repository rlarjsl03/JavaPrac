package Week_11_Prac;

class Sports {
    String GetName() {
        return "아직 결정되지 않음";
    }
    int getPlayers() {
        return 0;
    }
}
class Soccer extends Sports {
    Sports sports = new Sports();
    String GetName() {
        return "축구";
    }
    int getPlayers() {
        return 11;
    }
}

public class SportsTest {
    public static void main(String[] args) {
        Soccer sp = new Soccer();
        System.out.println("경기이름: " + sp.GetName());
        System.out.println("경기자수: " + sp.getPlayers());
    }
}
