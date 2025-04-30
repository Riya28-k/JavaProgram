package LibraryManagement;
import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private String ISBN;
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

class Member {
    private String name;
    private int memberId;
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    public void displayInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title:");
        String title = sc.nextLine();

        System.out.println("Enter Book Author:");
        String author = sc.nextLine();

        System.out.println("Enter Book ISBN:");
        String isbn = sc.nextLine();

        Book book = new Book(title, author, isbn);
        System.out.println("\nEnter Member Name:");
        String name = sc.nextLine();

        System.out.println("Enter Member ID:");
        int memberId = sc.nextInt();

        Member member = new Member(name, memberId);
        System.out.println("\nBook Details");
        book.displayInfo();

        System.out.println("\n Member Details");
        member.displayInfo();

        sc.close();
    }
}
