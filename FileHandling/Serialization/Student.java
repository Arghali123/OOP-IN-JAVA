package Serialization;
import java.io.Serializable;

public class Student implements Serializable{
 private int id;
 private String name;
 private String address;


 public Student(int id,String name,String address)
 {
    this.id=id;
    this.name=name;
    this.address=address;
 }

 public int getId()
 {
    return id;
 }

 public String getName()
 {
    return name;
 }
 public String getAddress()
 {
   return address;
 }

 public void display()
 {
   System.out.println("Name: "+name+" ,Roll no: "+id+" ,Address: "+address);
 }
}