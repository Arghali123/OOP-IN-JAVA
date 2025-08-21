package ProgramStructure;

public class Cource {
    private final int SIZE=5;
    private int courceCode;
    private String courceName;
    private Instructor courceInstructor;
    private Student courceStudent[]=new Student[SIZE];


    Cource()
    {
        courceCode=0;
        courceName="";
        courceInstructor=new Instructor();
        for(int i=0;i<SIZE;i++)
        {
            courceStudent[i]=new Student();
        }
    }
    Cource(int code,String name,Instructor instructor,Student[] studs)
    {
        setCourceCode(code);
        setCourceName(name);
        setInstructor(instructor);
        setStudents(studs);
    }

    protected void setCourceCode(int courceCode_in)
    {
        courceCode=courceCode_in;
    }
    protected void setCourceName(String courceName_in)
    {
        courceName=courceName_in;
    }
    protected void setInstructor(Instructor courceInstructor_in)
    {
        courceInstructor=new Instructor();
        courceInstructor=courceInstructor_in;
    }
    protected void setStudents(Student[] courceStudent_in)
    {
        for(int i=0;i<SIZE;i++)
        {
            courceStudent[i]=new Student();
            courceStudent[i]=courceStudent_in[i];
        }
    }

    public void display()
    {
        System.out.println("Cource Code: "+courceCode);
        System.out.println("Cource Name: "+courceName);
        System.out.println("Cource Instructor: "+courceInstructor.getName());
        System.out.println("Cource Student:");
        for(int i=0;i<SIZE;i++)
        {
            courceStudent[i].displayData();
        }
    }

}
