package Week_9_Prac;

import java.util.Scanner;

class Student {
    String name;
    private String studentID;
    int age;

    public Student(String name, String studentID, int age) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }
    public String getStudent() {
        return "Student  [name=" + name + ", rollno=" + studentID + ", age=" + age + "]";
    }
}

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름: ");
        String name = sc.nextLine();
        System.out.print("학생의 학번: ");
        String studentID = sc.nextLine();
        System.out.print("학생의 나이: ");
        int age = sc.nextInt();
        Student student = new Student(name, studentID, age);
        System.out.println(student.getStudent());
    }
}
