public class DoubleExample {
    public static void main(String[] args) {
        //Creaing a Double class object with value "6.9585"
        Double d=Double.parseDouble("6.9685");
        System.out.println(d);

        //Converting this Double(Number)object to  different primitive data types
        byte b=d.byteValue();
        short s=d.shortValue();
        int i=d.intValue();
        long l=d.longValue();
        float f=d.floatValue();
        double dl=d.doubleValue();

        System.out.println("Value of d after converting it to byte: "+b);
        System.out.println("Value of d after converting it to short: "+s);
        System.out.println("Value of d after converting it to int: "+i);
        System.out.println("Value of d after converting it to long: "+l);
        System.out.println("Value of d after converting it to float: "+f);
        System.out.println("Value of d after converting it to double: "+dl);

    }
}
