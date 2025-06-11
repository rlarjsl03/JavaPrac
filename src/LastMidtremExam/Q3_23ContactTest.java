package LastMidtremExam;

import java.util.Scanner;
import java.util.ArrayList;

class Contacts {
    String name;
    String tel;
    String email;
    static int count;
    public String getName() {
        return name;
    }
    public Contacts(String name, String tel, String email) {
        //super();
        this.name = name;
        this.tel = tel;
        this.email = email;
        count++;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getTel() {
        return tel;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Contacts.count = count;
    }
}

public class Q3_23ContactTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contacts> list = new ArrayList<>();

        System.out.println("연락처를 입력하시오(종료: exit)");

        while (true) {
            System.out.print("이름과 전화번호, 이메일을 입력하시오: ");
            String name = sc.next();
            if(name.equals("exit")) break;
            String tel = sc.next();
            String email = sc.next();
            list.add(new Contacts(name, tel, email));
        }
        System.out.println("지인들의 수는 " + Contacts.count + "입니다.\n");

        while(true) {
            System.out.print("검색할 이름을 입력하시오 (종료: exit): ");
            String name = sc.next();

            if(name.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }

            for (Contacts c : list) {
                if (c.getName().equals(name)) {
                    System.out.println(name + "\t 전화번호:" + c.getTel() + "\t 이메일:" + c.getEmail());
                }
            }
        }
    }
}
