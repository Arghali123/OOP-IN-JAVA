import java.util.Scanner;

public class IterationStatements {
    public static void main(String[] args) {
        // 1.)for loop:
        // The below Java program demonstrates a for loop that prints numbers from 0 to
        // 10 in a single line.
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        int arr[] = { 12, 21, 1, 2, 6 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2.)while loop
        Scanner scanner = new Scanner(System.in);
        // int enteredNumber;
        // while (true) {
        //     System.out.println("\nEnter a number: ");
        //     enteredNumber = scanner.nextInt();
        //     if (enteredNumber == 5) {   //keeps looping util the user enters 5
        //         System.out.println("existing!!!");
        //         break;
        //     }
        // }


        //3.) do-while loop:
        int nextnum;
        do{
            System.out.println("Enter a number: ");
            nextnum=scanner.nextInt(); 
        }while(nextnum!=7);
        System.out.println("Found man!!");
        
        scanner.close();
    }
}
