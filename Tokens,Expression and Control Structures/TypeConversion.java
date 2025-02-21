public class TypeConversion {
    public static void main(String[] args) {
        //Type converion(implicit conversion)(widening)
        //compiler converts automatically to larger data types.
        //Hierarchy:byte->short->int->long->float->double.
        int Intnumber=10;
        float FloatNumber=Intnumber;
        System.out.println(FloatNumber);

        //Type casting(Explicit conversion,narrowing)
        //programmer converts larger data type to small data type.
        //Hierarchy:double->float->long->int->short->byte.
        float secondFloatNumber=12.01f;
        int secondIntNumber=(int)secondFloatNumber;
        System.out.println(secondIntNumber);
    }
}
