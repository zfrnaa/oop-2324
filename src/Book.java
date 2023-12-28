import java.util.Scanner;

public class Book
{
    public static String title;
    public static String author;
    private static String bookCode, publisher;

    public static int yearPublished;

    public static float price;

    public Book(){
        System.out.println("Constructor executed");
    }

    public static void displayInfo(String title, String author, String publisher, int yearPublished,
                                   String bookCode, float price)
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + yearPublished +
                           " Publisher: " + publisher + "\nBook Code/ID: " + bookCode +
                           "\nPrice: RM" + price);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert title: ");
        title = input.nextLine();
        System.out.println("Please insert author: ");
        author = input.nextLine();

        System.out.println("Please insert book code: ");
        bookCode = input.nextLine();
        System.out.println("Please insert publisher: ");
        publisher = input.nextLine();
        System.out.println("Please insert year of published: ");
        yearPublished = input.nextInt();
        System.out.println("Please insert price: ");
        price = input.nextFloat();
        displayInfo(title, author, publisher, yearPublished, bookCode, price);
    }
}