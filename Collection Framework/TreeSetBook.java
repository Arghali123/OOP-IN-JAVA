import java.util.TreeSet;

public class TreeSetBook {
    public static void main(String[] args) {
        TreeSet<String> h=new TreeSet<String>();

        //adding elements into TreeSet
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");//adding duplicate elements

        //Displaying the TreeSet
        System.out.println(h);
        System.out.println("List contains India or not: "+h.contains("India"));

        //Removing items from the TreeSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia: "+h);
    }
}
