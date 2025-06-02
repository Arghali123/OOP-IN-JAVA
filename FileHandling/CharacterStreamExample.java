import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;


public class CharacterStreamExample {
    //reading and writing character stream

    public static void main(String[] args) {
        try
        {
          //Writing data to a file
        //   FileWriter writer=new FileWriter("bca.txt");
        //   BufferedWriter wbuffer=new BufferedWriter(writer);
        //   wbuffer.write("This is a content");
        //   wbuffer.write("This is another content");
        //   System.out.println("Content are written successfully!");
        //   wbuffer.close();
        //   writer.close();

        //read operation
        FileReader reader=new FileReader("bca.txt");
        BufferedReader rbuffer=new BufferedReader(reader);
        String data=rbuffer.readLine();
        System.out.println(data);
        rbuffer.close();
        reader.close();
       
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
