import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int age;
    double grade;

    // Constructor
    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Display student info
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        // Input student data
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();  // consume newline
            students[i] = new Student(name, age, grade);
        }

        // Sort by grade descending
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.grade, s1.grade); // Descending
            }
        });

        // Display top student
        System.out.println("\nTop Student:");
        students[0].display();

        // Display all students
        System.out.println("\nAll Students (Sorted by Grade - Descending):");
        for (Student s : students) {
            s.display();
        }
    }
}

