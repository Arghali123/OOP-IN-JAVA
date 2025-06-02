import java.util.LinkedList;

public class LinkedListBook {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        System.out.println("Initial size of list: "+ll.size());

        ll.add("C");
        ll.add("A");
        ll.add("E");
        ll.add("B");
        ll.add("D");
        ll.add("F");
        ll.add(1,"A2");

        System.out.println("Size of list after additions: "+ll.size());

        //Display the array list
        System.out.println("Contents of List: "+ll);

        //Remove elements from the array list
        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents of List: "+ll);
    }
}