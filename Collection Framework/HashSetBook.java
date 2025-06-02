import java.util.HashSet;

public class HashSetBook {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        //Adding elements into HashSet

        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");//adding duplicate elements

        //Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not: "+h.contains("India"));

        //removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("After removing Australia: "+h);
    }
}
