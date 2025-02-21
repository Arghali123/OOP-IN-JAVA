
public class Index
{
 

public void displayMsg1(String firstText,String lastText)
  {
    System.out.println(firstText+" "+lastText);
  }

public void displayMsg2(int a,int b)
  {
    System.out.println("Addition: "+(a+b));
  }

public void arthemeticOperation(float a,float b)
  {
   System.out.println("Addition: "+(a+b));
   System.out.println("Subtraction: "+(a-b));
   System.out.println("Multiplication: "+(a*b));
   System.out.println("Division: "+(a/b));
  }



public static void main(String[] args)
  {
    String text="Hello world";
    System.out.println(text);
    
    String fname="Daenish";
    String lname="Arghali";
    System.out.println(fname+" "+lname+" is my name");

    Index myIndex=new Index();
    Index oper=new Index();

    myIndex.displayMsg1("Man","Mohak");
    myIndex.displayMsg2(5,10);
    System.out.println("---------------------------------------");

    oper.arthemeticOperation(20,2);
    
  }

}