import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check type
        if (Character.isDigit(ch)) {
            System.out.println("It is a Digit.");
        } else if (Character.isLetter(ch)) {
            System.out.println("It is an Alphabet.");
        } else {
            System.out.println("It is a Special Character.");
        }
    }
}
