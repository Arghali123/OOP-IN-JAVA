import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        try
        {
          FileWriter writer=new FileWriter("example.txt");
          writer.write("Hello my name is danish arghali");
          writer.close();
          System.out.println("Successfully wrote to the file.");

        }catch(Exception e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
