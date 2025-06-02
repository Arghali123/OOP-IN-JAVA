import java.util.HashMap;
import java.util.Map;

public class MapBook {
    public static void main(String[] args) {
        //Initializing a Map
        Map <String,String> geek=new HashMap<String,String>();


        //put()method
        geek.put("124", "Code");
        geek.put("456", "Program");

        //get()method
        System.out.println("Value at key 6= "+geek.get("6"));
        System.out.println("Value at key 124= "+geek.get("124"));

        //isEmpty() method
        System.out.println("There is no key value pair: "+geek.isEmpty());

        //remove() method
        System.out.println("Remove: "+geek.remove("124"));
        System.out.println("Check the value of removed key: "+geek.get("124") );

        System.out.println("Size of dictionary: "+geek.size());
    }
}
