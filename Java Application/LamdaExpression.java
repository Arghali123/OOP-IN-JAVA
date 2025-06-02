@FunctionalInterface
interface iStudent{
    public void printName(String name);
}


public class LamdaExpression {
    public static void main(String[] args) {
        iStudent st= new iStudent(){
            public void printName(String name){
                System.out.println(name);
            }
        };
        st.printName("Sudan");

        iStudent st1= n->System.out.println(n);
        st1.printName("Danish");
    }
}
