public class Repace_MethodExample {
    public static void main(String[] args) {
        //replace(char oldChar,char newChar) method example
        String s1="javapoint is a very good website";
        String replaceString=s1.replace('a', 'e');//replaces all occurances of 'a' to 'e'
        System.out.println(replaceString);

        //replace(charSequence target,charSequence replacement) method example
        String s2="my name is khan my name is java";
        String replaceString2=s2.replace("is", "was");//replaces all occurances of "is" to "was"
        System.out.println(replaceString2);
    }
}
