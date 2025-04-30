import java.io.File;

public class CreateFile {
public static void main(String[] args) {
    try
    {
      File file=new File("example.txt");
      if(file.createNewFile())
      {
        System.out.println("File created: "+file.getName());
      }else
      {
        System.out.println("File already exist");
      }
    }catch(Exception e)
    {
        System.out.println("An error occured!!");
        e.printStackTrace();
    }
}
}