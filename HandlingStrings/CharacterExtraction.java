public class CharacterExtraction {
    public static void main(String[] args) {
        //charAt()
        String name="Daenish";
        char ch=name.charAt(3);
        System.out.println(ch);//It will return the character at index 3

        //getChars():if you need to extract more then one character at a time.
        String s="This is a demo of the getChars method.";
        int start=10;
        int end=14;
        char[] buff=new char[end-start];
        s.getChars(start, end, buff, 0);
        System.out.println(buff);
    }
}
