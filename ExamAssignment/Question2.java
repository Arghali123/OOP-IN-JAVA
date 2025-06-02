//Define a class Book with attributes title, author, and price. Create multiple book objects and display their details using a method.

import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    private String title;
    private String author;
    private double price;
    protected static ArrayList<Book> bookArrayList=new ArrayList<>();

    public Book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
        bookArrayList.add(this);
    }

    public void displayBookDetails()
    {
        System.out.println("Book title: "+title+" ,Book author: "+author+" ,Book price: "+price);
    }

}
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("How many books details you want to add in the booklist array: ");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of book"+(i+1));
            scanner.nextLine();

            System.out.print("Enter the title of the book: ");
            String title=scanner.nextLine();
            
            System.out.print("Enter the Author name: ");
            String author=scanner.nextLine();
            
            System.out.print("Enter the price of the book: ");
            double price=scanner.nextDouble();
            System.out.println();

            new Book(title, author, price);
        }
        System.out.println("Book infotmation!!");
        for(Book val:Book.bookArrayList)
        {
            val.displayBookDetails();
        }
        scanner.close();
    }
}
