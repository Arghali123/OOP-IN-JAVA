import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VivaSetExample 
{
    public static void main(String[] args) 
    {
        Set<String> cities=new HashSet<>();
        cities.add("London");
        cities.add("NewYork");
        cities.add("SanFrancisco");
        cities.add("Beiging");
        cities.add("NewYork");//Duplicate,will not be addded again

        System.out.println("Initial Cities: "+cities);

        //add new element
        cities.add("Paris");
        System.out.println("After adding Paris: "+cities);

        //size()
        System.out.println("Set size: "+cities.size());

        //remove()
        cities.remove("Beiging");
        System.out.println("After removing Beiging: "+cities);

        //check if an element exist
        System.out.println("Contains 'London'? "+cities.contains("London"));


        //addAll()
        Set<String> morecities=new HashSet<>(Arrays.asList("Tokyo","Delhi"));
        cities.addAll(morecities);
        System.out.println(cities);

        //removeAll()
        Set<String> removeSet=new HashSet<>(Arrays.asList("London","Delhi"));
        cities.removeAll(removeSet);
        System.out.println("After removeAll: "+cities);

        //retainAll()
        Set<String> retainSet=new HashSet<>(Arrays.asList("Tokyo","Paris"));
        cities.retainAll(retainSet);
        System.out.println("After retainAll: "+cities);


    }
}
