package LastMidtremExam;

import java.util.ArrayList;
import java.util.Scanner;


class Book{
    String title;
    String author;
    int score;

    public Book(String title, String author, int score) {
        this.title = title;
        this.author = author;
        this.score = score;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String toString() {
        return "[Title: " + title + ", Author: " + author + ", Score: " + score + "]";
    }
}

public class Q2_24BookTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        boolean a = false;
        Scanner sc = new Scanner(System.in);
        while (!a) {
            System.out.println("===============================");
            System.out.println("Book registration");
            System.out.println("Book search (title)");
            System.out.println("Book search (score)");
            System.out.println("Book List");
            System.out.println("Exit");
            System.out.println("===============================");
            System.out.print("Select the menu: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Registration: ");
                    String title = sc.next();
                    String author = sc.next();
                    int score = sc.nextInt();
                    books.add(new Book(title, author, score));
                    break;
                case 2:
                    System.out.print("Book title: ");
                    String name = sc.next();
                    for (int i = 0; i < books.size(); i++) {
                        Book c = books.get(i);
                        if (c.getTitle().equals(name)) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Book score: ");
                    int score1 = sc.nextInt();
                    for (int i = 0; i < books.size(); i++) {
                        Book c = books.get(i);
                        if (c.getScore() == score1) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Book list:");
                    for (int i = 0; i < books.size(); i++) {
                        Book c = books.get(i);
                        System.out.println(c);
                    }
                    break;
                case 5:
                    System.out.print("Bye");
                    sc.close();
                    a = true;
                    break;
            }
        }
    }
}