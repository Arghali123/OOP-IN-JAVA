import java.util.ArrayList;
import java.util.List;

public class ListBook {
public static void main(String[] args) {
    List<Integer> list=new ArrayList<Integer>();

    //adding items
    list.add(10);
    list.add(20);
    list.add(30);

    //retrieving items
    System.out.println(list);
    System.out.println("Item at index 1 is: "+list.get(1));

    //removing item
    list.remove(2);
    System.out.println("After removing Item");
    System.out.println(list);

    //getting size 
    System.out.println("List of Size is: "+list.size());

    //removing all items
    list.clear();
    System.out.println("After removing all items:");
    System.out.println(list);
}
}