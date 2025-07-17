import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");
        System.out.println("Initial list: "+list);

        //get()
        System.out.println("Element at index 1: "+list.get(1));

        //remove()
        list.remove(3);
        System.out.println("After removing index 3: "+list);

        //size()
        System.out.println("Size of the list: "+list.size());

        //isEmpty()
        System.out.println("Is the list empty?: "+list.isEmpty());

        //indexOf()
        System.out.println("First index of Apple: "+list.indexOf("Apple"));

        //lastIndexOf()
        System.out.println("Last index of Apple: "+list.lastIndexOf("Apple"));

        //conatains()
        System.out.println("Does the list contains 'Banana'?"+list.contains("Banana"));
        System.out.println("Does the list contains grape?"+list.contains("Grape"));

        //clear()
        list.clear();
        System.out.println("After clearing the list: "+list);
        System.out.println("After clearing the list: "+list);
        System.out.println("Is the list empty? "+list.isEmpty());

    }
}
