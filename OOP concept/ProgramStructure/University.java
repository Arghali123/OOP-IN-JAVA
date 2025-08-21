package ProgramStructure;

public class University {
    public static void main(String[] args) 
    {
        Student[] studs=new Student[5];
        studs[0]=new Student(1000, "Kumar Singh");
        studs[1]=new Student(1001, "John Smith");
        studs[2]=new Student(1002, "James Brown");
        studs[3]=new Student(1003, "Daenish Arghali");
        studs[4]=new Student(1004, "Niraj Baniya");

        Instructor inst1=new Instructor(11,"Ganesh Kumar");
        Cource cource1=new Cource(254, "Java Programming", inst1, studs);
        cource1.display();

    }
    
}
