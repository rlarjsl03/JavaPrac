package Week_2_Prac;

import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nationality, name, age, and height: ");
        String nationality = sc.next();
        String name = sc.next();
        int age = sc.nextInt();
        int height = sc.nextInt();
        sc.close();
        System.out.println("Nationality: " + nationality + " & Name: " + name);
        System.out.println("Age: " + age + " & Height: " + height);
    }
}