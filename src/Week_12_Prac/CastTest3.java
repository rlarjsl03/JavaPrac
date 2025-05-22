package Week_12_Prac;

class Super {
    public static final String SS = "Super";
    public static String sout() {
        return "SuperStatic";
    }
    public String nout() {
        return "SuperNormal";
    }
}

public class CastTest3 extends Super {
    public static final String SS = "sub";
    public static String sout() {
        return "SubStatic";
    }
    public String nout() {
        return "SubNormal";
    }
    public static void main(String[] args) {
        Super s = new CastTest3();
        CastTest3 ct = new CastTest3();
        System.out.println(s.SS);
        System.out.println(s.sout());
        System.out.println(s.nout());

        System.out.println(((CastTest3)s).SS);
        System.out.println(((CastTest3)s).sout());
        System.out.println(((CastTest3)s).nout());

    }
}
