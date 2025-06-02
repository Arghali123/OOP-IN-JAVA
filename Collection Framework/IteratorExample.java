import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();

        //adding elements into HashSet using add()
        h.add("Nepal");
        h.add("India");
        h.add("China");
        h.add("South Africa");

        //Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i=h.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}