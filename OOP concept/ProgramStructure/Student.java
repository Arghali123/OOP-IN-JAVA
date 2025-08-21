package ProgramStructure;

public class Student {
    private int id_no;
    private String name;

    Student()
    {
        id_no=0;
        name="";
    }
    Student(int my_id,String my_name)
    {
        id_no=my_id;
        name=my_name;
    }
    public void displayData()
    {
        System.out.println("ID No: "+id_no+" ,Name: "+name);
    }
}
