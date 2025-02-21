public class Book {

    String title;
    String author;
    float price;

    Book(String title,String author,float price)
    {
      this.title=title;
      this.author=author;
      this.price=price;
    }
    void display()
    {
      System.out.println("The tile: "+title+" ,author: "+author+",price: "+price);
    }


    //3.)Create a Book class with attributes title,author and price.Write a method to display the book details.Create a multiple objects
    //and display their information.
     public static void main(String[] args) {
        Book obj1=new Book("Rich Dad poor Dad","Robert T. Kiyosaki",555.50f);
        Book obj2=new Book("The Psychology of Money","Morgan Housel",770.9f);
        Book obj3=new Book("the kite runner","Khaled Hosseini",990f);

        obj1.display();
        obj2.display();
        obj3.display();
     }
}
