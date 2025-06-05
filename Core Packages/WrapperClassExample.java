public class WrapperClassExample {
    public static void main(String[] args) {
        //wrapping
        int a=10;
        double b=10.11;
        Integer obj1=Integer.valueOf(a);
        Double obj2=Double.valueOf(b);
        System.out.println("Wrapping into Integer class: "+obj1);
        System.out.println("Wrapping into Double class: "+obj2);

        //unwrapping 
        int unwrappedInteger=obj1;
        double unwrappedDouble=obj2;
        System.out.println("Unwrapping to int: "+unwrappedInteger);
        System.out.println("Unwrapping to double: "+unwrappedDouble);
    }
}
