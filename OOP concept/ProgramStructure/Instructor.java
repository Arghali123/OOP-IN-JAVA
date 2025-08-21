package ProgramStructure;

public class Instructor {
    private int employee_no;
    private String name;
    
    Instructor()
    {
        employee_no=0;
        name="";
    }
    Instructor(int employee_no,String name)
    {
      setEmployee_No(employee_no);
      setName(name);
    }

    protected void setEmployee_No(int employee_no)
    {
        this.employee_no=employee_no;
    }
    protected void setName(String name)
    {
        this.name=name;
    }

    protected int getEmployee_no()
    {
        return employee_no;
    }
    protected String getName()
    {
        return name;
    }
}
