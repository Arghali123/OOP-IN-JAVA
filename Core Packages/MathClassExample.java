import java.lang.Math;

public class MathClassExample {

    public static void main(String[] args) {
        //abs method
        int value1=-101;
        System.out.println("Absolute value: "+Math.abs(value1));

        //acos,asin,atan
        //value will be NAN(not a number) if >1
        double value2=0.7;
        System.out.println("ACos value: "+Math.acos(value2));
        System.out.println("ASin value: "+Math.asin(value2));
        System.out.println("ATan value: "+Math.atan(value2));

        //square and cube root
        System.out.println("Square root: "+Math.sqrt(25));
        System.out.println("Cube root: "+Math.cbrt(125));

        //ceil,floor
        double value3=77.11;
        System.out.println("Floor value: "+Math.floor(value3));
        System.out.println("Ceil value: "+Math.ceil(value3));
    }
}