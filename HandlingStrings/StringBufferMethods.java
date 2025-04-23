public class StringBufferMethods {
    public static void main(String[] args) {

        //append() method
        StringBuffer name=new StringBuffer("Daenish ");
        name.append("Arghali");
        System.out.println(name);

        //insert() method
        StringBuffer sb=new StringBuffer("Hello ");
        sb.insert(1, "Java");
        System.out.println(sb);

        //replace() method
        StringBuffer str=new StringBuffer("Hello");
        str.replace(1, 3, "Java");
        System.out.println(str);

        //delete() method
        StringBuffer str1=new StringBuffer("Nepathya");
        str1.delete(1, 3);
        System.out.println(str1);

        //replace() method
        StringBuffer str2=new StringBuffer("billi");
        str2.reverse();
        System.out.println(str2);
        
        //deleteCharAt() method
        StringBuffer sbf=new StringBuffer("raghav");
        System.out.println("String buffer before deletion: "+sbf);

        //Deleting the character at indexpoint 5
        sbf.deleteCharAt(5);
        System.out.println("After deletion new StringBuffer: "+sbf);

        //setLength()
        StringBuffer word=new StringBuffer("WelcomeGeeksforGeeks");
        System.out.println("String length: "+word.length()+" and contains: "+word);

        //set length equal to 10
        word.setLength(10);
        System.out.println("After stringLength() word: "+word);

        //ensureCapacity()
        StringBuffer ensure_capacity=new StringBuffer();
        System.out.println("Before ensureCapacity method capacity: "+ensure_capacity.capacity());

        ensure_capacity.ensureCapacity(18);

        System.out.println("After ensureCapacity method capacity: "+ensure_capacity.capacity());

        //Next example
        StringBuffer ensure_capacity1=new StringBuffer("Daenish Arghali");
        System.out.println("Before ensureCapacity method capacity: "+ensure_capacity1.capacity());
        ensure_capacity1.ensureCapacity(42);
        System.out.println("After ensureCapacity method capacity: "+ensure_capacity1.capacity());

        //StringBuffer length() vs capacity()
        StringBuffer msg=new StringBuffer("hello");
        System.out.println("buffer: "+msg);
        System.out.println("Length: "+msg.length());
        System.out.println("capacity: "+msg.capacity());
    
        //charAt() and setCharAt()
        StringBuffer c_buffer=new StringBuffer("Hello");
        System.out.println("buffer before: "+c_buffer);
        System.out.println("charAt(1) before: "+c_buffer.charAt(1));
        c_buffer.setCharAt(1, 'i');
        c_buffer.setLength(2);
        System.out.println("buffer after: "+c_buffer);
        System.out.println("charAt(1) after: "+c_buffer.charAt(1));
        
    }
}
