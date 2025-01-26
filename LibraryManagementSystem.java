// Java Project: Library Management System

// Abstract class to demonstrate Abstraction
abstract class LibraryItem {
    private String title; // Encapsulation
    private String author;
    private int id;

    public LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Abstract method for displaying details (Abstraction)
    public abstract void displayDetails();
}

// Child class to demonstrate Inheritance
class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, int id, int pageCount) {
        super(title, author, id);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Overriding displayDetails to demonstrate Polymorphism
    @Override
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ID: " + getId());
        System.out.println("Pages: " + pageCount);
    }
}

// Another child class
class Magazine extends LibraryItem {
    private String issue;

    public Magazine(String title, String author, int id, String issue) {
        super(title, author, id);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    // Overriding displayDetails to demonstrate Polymorphism
    @Override
    public void displayDetails() {
        System.out.println("Magazine Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ID: " + getId());
        System.out.println("Issue: " + issue);
    }
}

// Main class to run the project
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create objects of Book and Magazine
        Book book = new Book("Java Programming", "MD AL AMIN", 101, 450);
        Magazine magazine = new Magazine("Tech Today", "NAJIYA AMIN", 202, "January 2025");

        // Demonstrating Polymorphism
        LibraryItem item1 = book;
        LibraryItem item2 = magazine;

        item1.displayDetails();
        System.out.println();
        item2.displayDetails();
    }
}
