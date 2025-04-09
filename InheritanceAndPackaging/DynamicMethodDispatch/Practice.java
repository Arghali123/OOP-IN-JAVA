abstract class Daenish
{
  abstract void reading();

  void eating()
  {
    System.out.println("Father daenish is eating");
  }
}


class Child1 extends Daenish
{
   @Override
   public void reading()
   {
    System.out.println("Child 1 is reading");
   }

   @Override
   public void eating()
   {
    System.out.println("Child1 is eating");
   }
}

class Child2 extends Daenish
{
    @Override
    public void reading()
    {
        System.out.println("Child2 is reading");
    }

    @Override
    public void eating()
    {
        System.out.println("Child2 is reading");
    }
}

public class Practice {

    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.reading();
        child1.eating();

        Child2 child2=new Child2();
        child2.reading();
        child2.eating();
    }
}