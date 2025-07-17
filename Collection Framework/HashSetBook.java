
import java.util.TreeSet;

public class HashSetBook {
    public static void main(String[] args) 
    {
       TreeSet<Integer> numbers=new TreeSet<>();
       numbers.add(10);
       numbers.add(5);
       numbers.add(10);
       System.out.println("TreeSet: "+numbers);//no duplicate allowed

       TreeSet<String> fruits=new TreeSet<>();
       fruits.add("Mango");
       fruits.add("Banana");
       fruits.add("Apple");
       System.out.println(fruits);//automatically sorted

       TreeSet<String> cities=new TreeSet<>();
       cities.add("Kathmandu");
       cities.add("Bhaktapur");
       cities.add("Lalitpur");
       System.out.println("TreeSet(Sorted not inserted): "+cities);

       TreeSet<Integer> data=new TreeSet<>();
       for(int i=1000;i>=1;i--)
       {
        data.add(i);
       }
       //fast retrieval 
       System.out.println("Smallest element: "+data.first());
       System.out.println("Largest element: "+data.last());

       TreeSet set=new TreeSet<>();
       set.add("Apple");
       set.add("Banana");
       set.add(100);
       System.out.println(set);//ClassCastException
    }
}
