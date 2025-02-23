import java.util.Scanner;

public class StaticKeywordHlw {
    //1.) Calculate the volume of cuboid using static keyword.
    static int l,b,h;
    static int cuboid()
    {
        return l*b*h;
    }

    //2.)Calculate the simple interest.
    static double p,r,t;
    static double si()
    {
        return (p*r*t)/100;
    }
   public static void main(String[] args) {
    Scanner myScanner=new Scanner(System.in);
    System.out.print("Enter length: ");
    StaticKeywordHlw.l=myScanner.nextInt();
    System.out.print("Enter breadth: ");
    StaticKeywordHlw.b=myScanner.nextInt();
    System.out.print("Enter height: ");
    StaticKeywordHlw.h=myScanner.nextInt();
    System.out.println("The volume of cuboid: "+StaticKeywordHlw.cuboid());

    System.out.println("--------------------------------------------");

    System.out.print("Enter the Priciple: ");
    StaticKeywordHlw.p=myScanner.nextDouble();
    System.out.print("Enter the rate of interest: ");
    StaticKeywordHlw.r=myScanner.nextDouble();
    System.out.print("Enter the time in years: ");
    StaticKeywordHlw.t=myScanner.nextDouble();
    System.out.println("The simple interest: "+StaticKeywordHlw.si());
    myScanner.close();
   }

}
