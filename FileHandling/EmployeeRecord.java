import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("EmployeeRecord.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter the details of Employee " + i);

                System.out.print("Enter id: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter address: ");
                String address = sc.nextLine();

                System.out.print("Enter post: ");
                String post = sc.nextLine();

                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); // consume newline

                writer.write("Employee id: " + id + ", Employee Name: " + name +
                        ", Address: " + address + ", Post: " + post +
                        ", Salary: " + salary + "\n");
            }

            writer.close();
            System.out.println("Successfully recorded employee data!");

        } catch (IOException e) {
            System.out.println("ERROR Writing to file: " + e.getMessage());
        }

        // Now read and filter managers
        System.out.println("\nEmployees whose post is manager:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("EmployeeRecord.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("post: manager")) {
                    System.out.println(line);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("ERROR Reading file: " + e.getMessage());
        }

        sc.close(); // Close Scanner at the very end
    }
}
