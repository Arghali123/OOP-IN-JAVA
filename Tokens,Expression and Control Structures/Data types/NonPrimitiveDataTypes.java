import java.util.Arrays;

public class NonPrimitiveDataTypes
{
    public static void main(String[] args)
    {
        //2.)Non-primitive data types
        //1.)String:Sequence of characters.
        String collageName="Nepathya collage";
        System.out.println(collageName);

        //2.)Array:Collection of elements with same data type
        int[] arrayOfNumbers={1,2,3,4,5};
       // System.out.println(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));

        //3.) Class:Instance of an object

        //4.) Enum:Constant values in object(e.g dropdown in Gender field)

        //Hlw
            //1.Add two integer numbers
            int a=10;
            int b=3;
            int addresult=a+b;
            System.out.println(addresult);
    
            //2.)Subtract float numbers
            float x=12.12f;
            float y=14.13f;
            float subresult=x+y;
            System.out.println(subresult);
    
            //3.)Print
            System.out.println("Java is programming language");
    
            //4.)ASCII value for 66
            char charExample=66;
            System.out.println(charExample);
    }
}