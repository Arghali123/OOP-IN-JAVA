import java.util.Arrays;//Pakage
public class Datatypes
{
    public static void main(String[] args)
    {
        //varibles->are container where we can store values.
        //Datatypes->The type of data that a variable can  hold.
        //Java is a Statically-Typed-Language which means every variable must have specific data types before use.Jun data type
        //declare gara xam tei type ko data rakhnu parxa.

        //Java is case sensitive

        //Types of data types:
        //a.)Primitive data type:It specifies the type and kind of value it can hold.The different types of primitive data types are given
        //below:

        //1. byte:(size: 1 byte),(range: -128 to 127)
        byte byteExample=13;
        System.out.println(byteExample);

        //2.)short:(size:2 bytes),(range:-32768 to 32767)
        short shortExamle=32767;
        System.out.println(shortExamle);

        //3.)int:(size:4bytes),(range:-2^31 to 2^31-1)
        int intExample=8939834;
        System.out.println(intExample);

        //4.)long:(size: 8bytes),(range:)
        long longExample=9911998331L;
        System.out.println(longExample);

        //5.)float:(size:)used to store decimal point values.sufficient for storing 6 to t decimals
        float floatExample=22.333232f;
        System.out.println(floatExample);

        //6.)double:(stores values for decimal points).Sufficient for storing 15 to 16 decimal.
        double doubleExample=12.23232d;
        System.out.println(doubleExample);

        //7.)boolean:(stores boolean values either true or false)
        boolean booleanExample=true;
        System.out.println(booleanExample);

        //8.)char:(stores a single character or ASCII values)
        char charExample='A';
        char charExample1=97;
        System.out.println(charExample);
        System.out.println(charExample1);

        //Non-primitive data type:These datatypes refer's to objets or arrays.
        //1.)String:Sequence of characters.
        String collageName="Nepathya collage";
        System.out.println(collageName);

        //2.)Array:Collection of elements with same data type
        int[] arrayOfNumbers={1,2,3,4,5};
       // System.out.println(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));

        //3.) Class:Instance of an object

        //4.) Enum:Constant values in object(e.g dropdown in Gender field)
    }
}