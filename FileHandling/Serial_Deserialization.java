import java.io.*;
class A implements Serializable
{
    int i;
    String s;

    public A(int i,String s)
    {
        this.i=i;
        this.s=s;
    }
}

public class Serial_Deserialization {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        A a=new A(1, "Daenish");

        //Serializing 'a'
        FileOutputStream fos=new FileOutputStream("hello.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);
        System.out.println("Completed!!");
        
        //De-serializing 'a'
        FileInputStream fis=new FileInputStream("hello.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        A b=(A)ois.readObject();
        
        System.out.println(b.i+" "+b.s);

        oos.close();
        ois.close();
    }
}