import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class DictinaryClassExample {
    public static void main(String[] args) {
      Dictionary<String,String> dictionary=new Hashtable<>();
      
      //put(key,value)
      dictionary.put("Nepal", "Kathmandu");
      dictionary.put("India", "New Delhi");
      dictionary.put("Usa", "Washington D.C");
      dictionary.put("Japan", "Tokiyo");

      System.out.println(dictionary);

      //get(object key)
      System.out.println("Capital city of Nepal: "+dictionary.get("Nepal"));

      //size()
      System.out.println("Total Countries in dictionary: "+dictionary.size());

      //isEmpty()
      System.out.println("Is Dictionary Empty? "+dictionary.isEmpty());

      //keys() and elements()
      System.out.println("\nAll Countries and their capitals:");
      Enumeration<String> keys=dictionary.keys();
      Enumeration<String> values=dictionary.elements();

      while(keys.hasMoreElements() && values.hasMoreElements())
      {
        System.out.println(keys.nextElement()+" =>"+values.nextElement());
      }

      //remove(object key)
      dictionary.remove("Japan");
      System.out.println("\nAfter removing Japan:");
      keys=dictionary.keys();
      while (keys.hasMoreElements()) {
        
        String key=keys.nextElement();
        System.out.println(key+" =>"+dictionary.get(key));
      }

    }
}
