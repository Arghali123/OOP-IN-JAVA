import java.util.Scanner;//pacakge

public class UserInput {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter anything: ");

        int intNumber = Scanner.nextInt();
        float floatNumber = Scanner.nextFloat();
        double doubleNumber = Scanner.nextDouble();

        System.out.println("The entered integer is: " + intNumber);
        System.out.println("The entered float is: " + floatNumber);
        System.out.println("The entered double number is: " + doubleNumber);

        Scanner.close(); Scanner.close();

    }

}