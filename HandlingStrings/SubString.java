public class SubString {
    public static void main(String[] args) {
        String s1="javatPoint";
        System.out.println(s1.substring(2,4));//returns va
        System.out.println(s1.substring(2));//retuns vatPoint

        String subStr=s1.substring(0);
        System.out.println(subStr);
        String subStr2=s1.substring(5,10);//starts from 5 and goes to 10
        System.out.println(subStr2);
        String subStr3=s1.substring(5,15);//Retuns exception
        System.out.println(subStr3);
    }
}
