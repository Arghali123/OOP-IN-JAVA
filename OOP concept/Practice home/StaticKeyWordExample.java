class Employee
{
    String name;
    String post;
    int id;
    static String OrganizationName;

    //static counter to set unique id no
    static int counter=0;

    public Employee(String name,String post)
    {
        this.name=name;
        this.post=post;
        this.id=setIdNo();
    }

    //getting unique Idno through static variable(counter)
    static int setIdNo()
    {
        counter++;
        return counter;
    }

    static void setOrgName(String name)
    {
        OrganizationName=name;
    }

    //Instance method
    void getEmployeeInfo()
    {
        System.out.println("Employee Id: "+this.id);
        System.out.println("Organization name: "+OrganizationName);
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee Post: "+this.post);
    }

}

public class StaticKeyWordExample {
    public static void main(String[] args) {
        Employee.setOrgName("ArghaliGroup");

        Employee emp1=new Employee("Puran", "Manager");
        Employee emp2=new Employee("Akash", "Analyst");
        Employee emp3=new Employee("Aman", "Coordinator");

        emp1.getEmployeeInfo();
        emp2.getEmployeeInfo();
        emp3.getEmployeeInfo();
    }
}
