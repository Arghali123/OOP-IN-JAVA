import java.util.Vector;
public class VectorClassExample {

    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<Integer>();
        int i;
        for(i=1;i<=10;i++)
        {
            vec.add(i);
        }

        //display
        System.out.println(vec);


        //remove(5)
        vec.remove(5);
        System.out.println("After removing element at index 5: ");
        System.out.println(vec);

        //size()
        System.out.println("Size of vector is: "+vec.size());

        //clear()
        vec.clear();
        System.out.println("After clearing vector object");
        System.out.println(vec);
    }
}