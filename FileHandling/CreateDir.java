import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        File dir=new File("myfolder");
        if(dir.mkdir())
        {
            System.out.println("Directry created!!");
        }else
        {
            System.out.println("Directry already exists!!");
        }
    }
}
