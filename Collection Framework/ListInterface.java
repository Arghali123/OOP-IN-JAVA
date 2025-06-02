//An ordered collection that allows to store duplicate elements.
//Elements can be accessed by index
//Common implementation
   //ArrayList:Dynamic array,fast access.
   //linked list: doubly linked list,better for insert and delete.

import java.util.ArrayList;
import java.util.List;;
public class ListInterface {
    public static void main(String[] args) {
        List <String> names=new ArrayList<>();
        names.add("BCA");
        names.add("CSIT");
        names.add("BCA");//Duplicate element

        System.out.println(names);
    }
}
