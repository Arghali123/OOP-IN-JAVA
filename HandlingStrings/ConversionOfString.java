public class ConversionOfString {
    public static void main(String[] args) {
        int a=10;
        double b=5.5;

        //Converting other types to String
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);

        //Concatinating of two strings
        String s3=s1+s2;
        System.out.println(s3);


        //Converting String to any type
        String str1="15";
        String str2="12.5";
        int x=Integer.parseInt(str1);
        double y=Double.parseDouble(str2);
        double result=(double)x+y;
        System.out.println("result: "+result);
    }
}
