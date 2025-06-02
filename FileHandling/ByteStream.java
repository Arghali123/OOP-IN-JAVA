import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
    public static void main(String[] args) {
        try
        {
            //write
            // FileOutputStream output=new FileOutputStream("bca.txt");
            // int content=1011011;
            // output.write((byte)content);
            // System.out.println("Byte Stream Written sucessfully");
            // output.close();

            //read
            FileInputStream input=new FileInputStream("bca.txt");
            int data=input.read();
            System.out.println((char)data);
            input.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
