package Week_9_Prac;

class Person {
    String name;
    private String mobile;
    private String office;
    private String email;

    public Person(String n, String m, String o, String e) {
        name = n;
        mobile = m;
        office = o;
        email = e;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", mobile=" + mobile + ", office=" + office + ", email=" + email + "]";
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setMobile(String m) {
        mobile = m;
    }
    public String getMobile() {
        return mobile;
    }
    public void setOffice(String o) {
        office = o;
    }
    public String getOffice() {
        return office;
    }
    public void setEmail(String e) {
        email = e;
    }
    public String getEmail() {
        return email;
    }
}

public class Prac2 {
    public static void main(String[] args) {
        Person obj = new Person("Kim", "01012345678", "0311234567", "abd@example.net");
        System.out.println(obj);

        System.out.println("name= " + obj.getName() + ", moblie= " + obj.getMobile() + ", office= " + obj.getOffice() + ", email= " + obj.getEmail());
        obj.setName("Park");
        obj.setMobile("01087654321");
        obj.setOffice("0411234567");
        obj.setEmail("cba@example.ac.kr");
        System.out.println(obj);

        Person obj2 = obj;
        System.out.println(obj2);

    }
}
