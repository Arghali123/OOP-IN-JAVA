class Human
{
    public void eat()
    {
        System.out.println("Human is eating");
    }
}

public class Boy extends Human{
    public void eat()
    {
      System.out.println("Boy is eating");
    }
    public static void main(String[] args) {
        Boy b=new Boy();
        b.eat();
    }
}
