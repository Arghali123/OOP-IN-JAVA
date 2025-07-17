import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) 
    {
     ArrayList<String> list=new ArrayList<>();
     list.add("Ram");
     list.add("Shyam");
     list.add("Hari");
     Collections.sort(list);
     System.out.println(list);
    }
}
