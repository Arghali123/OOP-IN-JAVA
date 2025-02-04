import java.util.Arrays;

public class Datatypes
{
    public static void main(String[] args)
    {
        //1.Primitive data tyes:
        byte byteExample=122;
        System.out.println(byteExample);

        short shortExample=32767;
        System.out.println(shortExample);

        int intExample=232322;
        System.out.println(intExample);

        long longExample=9811998331l;
        System.out.println(longExample);

        float floatExample=12.232322f;
        System.out.println(floatExample);

        double doubleExample=11.11212121d;
        System.out.println(doubleExample);

        boolean booleanExample=false;
        System.out.println(booleanExample);

        char charExample='B';
        char charExample1=98;
        System.out.println(charExample);
        System.out.println(charExample1);

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
            //char charExample=66;
            System.out.println(charExample);
    }
}