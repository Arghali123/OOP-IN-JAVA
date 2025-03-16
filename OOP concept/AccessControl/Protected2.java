package AccessControl;

class Protected2 extends Protected1{
    public static void main(String[] args) {
        Protected2 obj=new Protected2();
        obj.display();
        System.out.println("Addition: "+(15+obj.a));
    }
}
