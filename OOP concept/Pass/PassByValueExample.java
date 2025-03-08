

public class PassByValueExample {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        int b=a;
        System.out.println(b);
        b=50;
        System.out.println(b);
        System.out.println(a);
    }
}
