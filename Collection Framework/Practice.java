import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

      //List interface
      List<String> names=new ArrayList<>();
      names.add("Daenish");
      names.add("Priyankawa");
      names.add("Daenish");//Duplicate element
      System.out.println(names);

      //set interface
      Set<String> setExample=new HashSet<>();
      setExample.add("BCA");
      setExample.add("BBA");
      setExample.add("BCA");
      System.out.println(setExample);

      //Map interface
      Map<Integer,String> mapExample=new HashMap<>();
      mapExample.put(1,"Meow");
      mapExample.put(2,"Bhau Bhau");
      mapExample.put(3,"hee heee");
      System.out.println(mapExample);
    }
}
