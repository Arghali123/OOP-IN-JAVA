import java.io.File;

public class MakeDir {
    public static void main(String[] args) {
        File dir=new File("My directry");
        if(dir.mkdir())
        {
            System.out.println("File created successfully");
        }else
        {
            System.out.println("Directory already exists");
        }
    }
}
