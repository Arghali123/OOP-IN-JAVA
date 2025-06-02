import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
   public static void main(String[] args) {
    FileInputStream input=null;
    FileOutputStream output=null;
    try
    {
        input=new FileInputStream("input.txt");
        output=new FileOutputStream("output.txt");

        int bytedata;
        while ((bytedata=input.read())!=-1) {
            output.write(bytedata);
        }
        System.out.println("File copied using byte stream.");
    }catch(IOException e)
    {
        e.printStackTrace();
    }finally
    {
        try
        {
            if(input!=null) input.close();
            if(output!=null) output.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
   } 
}
