import java.util.Stack;
public class StackClassExample {
    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
       //push() 
       int i;
       for(i=1;i<=10;i++)
       {
        st.push(i);
       }

       System.out.println("After inserting in Stack");
       System.out.println(st);

       //pop()
       st.pop();
       st.pop();
       System.out.println("After deleting from the stack");
       System.out.println(st);

       //empty(),peek() and search()

       if(st.isEmpty())
       {
        System.out.println("Stack is empty");
       }else
       {
        System.out.println("Stack is not empty");
        System.out.println("Peek Item= "+st.peek());
        System.out.println("Item position of 5: "+st.search(5));
       }
    }
}
