import java.util.HashMap;

public class HashMapBook {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("vishal", 10);
        map.put("sachin", 20);
        map.put("vaibhav", 30);

        System.out.println(map);
        System.out.println("Size of map is: "+map.size());

        if(map.containsKey("vishal"))
        {
            Integer a=map.get("vishal");
            System.out.println("Value for key \"vishal \" is: "+a);
        }

        map.clear();
        System.out.println("After Clearint Map: ");
        System.out.println(map);
    }
}
