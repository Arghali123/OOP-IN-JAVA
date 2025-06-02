//Collection of elements that does not allow duplicate elements
//no index-based access.

import java.util.Set;
import java.util.HashSet;
public class SetInterface {
    public static void main(String[] args) {
        Set<String> setExample=new HashSet<>();
        setExample.add("CSIT");
        setExample.add("BCA");
        setExample.add("CSIT");//Duplicate element

        System.out.println(setExample);
    }
}
