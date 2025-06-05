import java.util.Hashtable;
public class HashTableClassExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> hash=new Hashtable<Integer,String>();

        //put some elements
        hash.put(1, "beer");
        hash.put(2, "tea");
        hash.put(5, "coffee");

        System.out.println(hash);
        System.out.println("Getting the value of key 5: "+hash.get(5));

        //remove()
        hash.remove(2);
        System.out.println(hash);

    }
}
