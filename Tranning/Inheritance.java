//
class Arithmetic {

    public void displayA()
    {
        System.out.println("AAAA");
    }

    public void displayB()
    {
        System.out.println("BBBBB");
    }

    public int addTwoDigit(int a, int b){
        return a+b;
    }
}

class Addition extends Arithmetic{
    @Override
  public void displayA()
  {
    System.out.println("aaaa");
  }
  public void displayAB()
  {
    super.displayA();
    this.displayA();
  }
  
}






public class Inheritance {
    public static void main(String[] args) {
    Addition obj=new Addition();
    obj.displayAB();
    }
     
}
