import java.util.Scanner;

public class Posting {
    int[] jobCodes={131,132,133};
    int courceMark;
    int aptTest;
    int techTest;
    int interview;

    void employee(int courceMark,int aptTest,int techTest,int interview)
    {
        int x=courceMark+aptTest+techTest+interview;
        if(x>=80)
        {
            System.out.println("Congrats! You are selected as Programmer");
        }else
        {
            System.out.println("Sorry.Not seleceted,Try again! All the best");
        }
    }
    void employee(int techTest,int interview)
    {
        int x=techTest+interview;
        if(x>=85)
        {
            System.out.println("Congrats! You are selected as Team Leader");
        }else
        {
            System.out.println("Sorry.Not selected.Try again! All the best");
        }
    }

    void employee(int interview)
    {
        int x=interview;
        if(x>=90)
        {
            System.out.println("Congrats! You are selected as Project Manager");
        }else
        {
            System.out.println("Sorry.Not selected.Try again! All the best");
        }
    }

    void readMarks(int code)
    {
        Scanner sc=new Scanner(System.in);
        switch(code)
        {
            case 131:
            System.out.println("Enter your Cource mark(Max:25)");
            courceMark=sc.nextInt();
            System.out.println("Enter your aptTest mark(Max:25)");
            aptTest=sc.nextInt();
            System.out.println("Enter your TechTest mark(Max:25)");
            techTest=sc.nextInt();
            System.out.println("Enter your interview mark(Max:25)");
            interview=sc.nextInt();
            break; 
            
            case 132:
            System.out.println("Enter your TechTest mark(Max:50)");
            techTest=sc.nextInt();
            System.out.println("Enter your interview mark(Max:50)");
            interview=sc.nextInt();
            break;
    
            case 133:
            System.out.println("Enter your interview mark(Max:50)");
            interview=sc.nextInt();
            break;
        }
    }
    public static void main(String[] args) {
        Posting emp=new Posting();
        emp.readMarks(emp.jobCodes[0]);
        emp.employee(emp.courceMark,emp.aptTest, emp.techTest, emp.interview);

        emp.readMarks(emp.jobCodes[1]);
        emp.employee(emp.techTest, emp.interview);
    }
}
