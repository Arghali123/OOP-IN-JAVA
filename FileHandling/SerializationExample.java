import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Serialization.Student;

public class SerializationExample {
    public static void main(String[] args) {
        try
        {
            Student student=new Student(1001, "daenish");
        //create a file named student.ser(extension.ser=serialized object) 
        FileOutputStream fileOutput=new FileOutputStream("student.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileOutput);//object lai serialized ma convert garna kam garxa

        //convert the object into the byte stream
        out.writeObject(student);
        out.close();
        fileOutput.close();
        System.out.println("Serialization done.!!");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
       
}
}