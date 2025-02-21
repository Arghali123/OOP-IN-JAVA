public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary)
    {
      this.name=name;
      this.id=id;
      this.salary=salary;
    }

    double calculateBonus()
    {
      return salary*0.1;
    }
  
    void displayEmployeeDetails()
    {
      System.out.println("Name: "+name);
      System.out.println("Id: "+id);
      System.out.println("Salary: "+salary);
      System.out.println("Bonus: "+calculateBonus());
      System.out.println("Net salary: "+(salary+calculateBonus()));
    }
   


    //4.)Create a Employee class with attributes name,id,salary.Add a method calculateBonus() that returns 10% of salary as a bonus.


    //Main function
    public static void main(String[] args) {
        Employee obj=new Employee("Daenish",10,100000);
        obj.displayEmployeeDetails();
    }
}
