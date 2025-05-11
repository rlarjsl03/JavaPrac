package Week_7_Prac;

import java.util.ArrayList;
import java.util.Scanner;

class Contact{
    String[] contact = new String[3];
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email){
         this.name = name;
         this.phone = phone;
         this.email = email;
    }
    public String Name() {
        return name;
    }
    public String Phone() {
        return phone;
    }
    public String Email() {
        return email;
    }
    public String PrintInfo() {
        return "전화번호 : " + phone + "\t이메일:" + email;
    }
}
class Store{
    ArrayList<Contact> lists = new ArrayList<>();

    public void StoreList(String name, String phone, String email) {
        lists.add(new Contact(name, phone, email));
    }
    public void Find(String a) {
        for(int i = 0; i < lists.size(); i++) {
            if(lists.get(i).Name().equals(a)) {
                System.out.println(lists.get(i).Name() + "\t\t" + lists.get(i).PrintInfo());
            }
        }
    }
}

public class ContactTest {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        System.out.println("연락처를 입력하시오(종료: exit)");
        while(true) {
            i++;
            System.out.print("이름과 전화번호, 이메일을 입력하시오: ");
            String input = sc.nextLine();
            String[] a = input.split(" ");
            store.StoreList(a[0], a[1], a[2]);

            if(input.equals("exit"))
                break;
        }
        System.out.println("지인들의 수는 " + (i-1) + "입니다");

        boolean flag = false;
        while (!flag) {
            System.out.print("검색할 이름을 입력하시오 (종료: exit): ");
            String a = sc.nextLine();
            if (a.equals("exit")){
                flag = true;
            }
            store.Find(a);
        }
    }
}