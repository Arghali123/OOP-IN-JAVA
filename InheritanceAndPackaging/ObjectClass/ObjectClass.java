package ObjectClass;
class Laptop
{
    private String make;
    private int price;

    public Laptop(String make, int price) {
        this.make = make;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Make: "+make+" ,Price: "+price;
    }

    @Override
    public boolean equals(Object laptop2)
    { 
       Laptop that=(Laptop) laptop2;
       return this.make==that.make && this.price==that.price;
    }

    @Override
    public Laptop clone()
    {
        return new Laptop(this.make, this.price);
    }

    
}
public class ObjectClass {
    public static void main(String[] args) {
         Laptop laptop=new Laptop("Dell", 100000);
        //1.)toString()
         System.out.println(laptop.toString());

         //2.)getClass()
         System.out.println(laptop.getClass());

         //3.)getName()
         {
            System.out.println(laptop.getClass().getName());
         }

         //4.)equals()
         Laptop laptop2=new Laptop("Dell",20000);
         System.out.println(laptop.equals(laptop2));

         //5.)hashcode()
         System.out.println(laptop.hashCode());
         System.out.println(laptop2.hashCode());

         //6.)clone()
         Laptop laptop3;
         laptop3=(Laptop) laptop.clone();
         System.out.println(laptop.equals(laptop3));
         System.out.println(laptop3);

    }
}
