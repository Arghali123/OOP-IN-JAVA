import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBook {
    public static void main(String[] args) {
        //Set demonstration using HashSet
        Set<String> hash_Set=new HashSet<String>();
        hash_Set.add("Geeks");
        hash_Set.add("for");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        System.out.println("Set Output without duplicates");

        System.out.println(hash_Set);

        //Set demonstration using TreeSet
        System.out.println("Sorted Set After passing into TreeSet");
        Set<String> tree_Set=new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);

    }
}
