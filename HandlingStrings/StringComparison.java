public class StringComparison {
public static void main(String[] args)
{
    //equals() method
    String s1="daenish";
    String s2="daenish";
    String s3=new String("daenish");
    String s4="Niraj";
    String s5="DAENISH";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));

    //equalsIgnoreCase() method
    System.out.println(s1.equalsIgnoreCase(s5));

    //compareTo() method
    String str1="hello";
    String str2="hello";
    String str3="meklo";
    System.out.println(str1.compareTo(str2));//0 because both are equal
    System.out.println(str1.compareTo(str3));//-5 because "h" is 5 times lower than "m"

}
}