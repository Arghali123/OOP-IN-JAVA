public class HandlingStrings {

    public static void main(String[] args) {

        //Concatination
        String f_name="Daenish";
        String l_name="Arghali";
        String full_name=f_name+" "+l_name;
        System.out.println("Concatination example: "+full_name);

        //Conversion
        int num=1234;
        String TostringConversion=String.valueOf(num);
        System.out.println("String conversion: "+TostringConversion);
        System.out.println("TostringConversion data type:"+TostringConversion.getClass().getName());

        //Case Change
        String mixed="Hello World";
        System.out.println("UpperCase: "+mixed.toUpperCase());
        System.out.println("LowerCase: "+mixed.toLowerCase());

        //Extracting characters
        String name="Programming";
        char first_char=name.charAt(0);
        char fifth_char=name.charAt(4);
        System.out.println("First character: "+first_char);
        System.out.println("Fifth character: "+fifth_char);

        //String comparision
        String s1="Java";
        String s2="Java";
        String s3=new String("Java");
        String s4="java";

        //using ==
        System.out.println("s1==s2: "+(s1==s2));//true
        System.out.println("s1==s3: "+(s1==s3));//false auexa kina vana objects different xa

        //using  .equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s4));

        //Searching strings
        String text="Java is a programming language";
    
        //check of it contains 
        System.out.println("Conatins programming: "+text.contains("programming"));

        //Index of string occurance
        int first_index=text.indexOf("Java");
        System.out.println("First 'Java' is at: "+first_index);


        //Nepathya collge ma ko vowel ra consonant count garara auena.
    }
}