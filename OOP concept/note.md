# Fundametals of class 
Class are the templates that are used to crete objects,and to define the objects data types and methods.A class is a user defined blue print or prototype from which objects are created.
Class(blue print of an object)
```
Syntax:
class ClassName(classNameAlways start from capital letter)
{
    " Data members
    " methods
}
eg:
class Student
{
    String name;
    Srring address;
    void details()
    {
        System.out.print(name+address);
    }
}

//Creating object
Student student=new Student();
student.details();

```
object(instance of class)

### Features of OOP
- Abstraction:chahina cheeze matra dekhauna.
- polymorphism:many form.
- inheritance
- encapsulation
- classes and object
- modularity

# Constructor
A *constructor* in Java is a block of code similar to method that's is called when an instance of object is created.Here are difference between constructor and method:
- A constructor doesnot have return type.
- The name of constructor must be same as the name of the class.
- Unlike,methods constructor are not considered as member of class.
- A constructor is called automatically when a new instance of an object is created.

> Note: All classes have constructor whether you define or not,because Java automatically provide's a default constructor that initializes all members variables to zero.There are 2 types of constructor Default constructor and Parameterized Constructor.

Syntax of Constructor:
```
class Classname
{
    Classname()
    {

    }
}
```
## Default Constructor
The *default constructor* is a constructor that is automatically generated in the absence of explicit constructor(i.e user defined constructor).Sometimes also called *nullary* constructor.

## Parameterized Constrcutor
The constructor which has parameters or arguments is known as parameterized constructor.The values of arguments are assigned to data members of the class.

## The this keyword
Keyword *this* is a reference variable in Java that refer's to the current object.The various uses of this keyword are as follow:
- It can be used to refer the instance variable of current class.
- It can be used to invoke or initiate current class constructor.
- It can be used as an argument in the method call.
- It can be used as argument in the constructor call.
- it can be used to return the current class instance.

Sometimes a method will need to refer to the object that invoked it.To allow this,Java defined *this* keyword.*this* can be used inside any method to refer to the current object.That is ,*this* is always a refernce to the object on which the method was invoked.You can use 
*this* anywhere a reference to an object of the currenr class type is permitted.

# Four main features of Object Oriened Programming
- Abstraction
- Encapsulation
- Polymorphism
- Inheritance

## Abstraction
It is a process of hiding the implementation details from the user,only the functionality will be provided to the user.In Java,abstraction
is achieved using Abstract classes and interfaces.

### Abstract class
A class which contains the **abstract** keyword in its declaration is known as abstract class.
- Abstract classes may or maynot contain abstract methods i.e, methods without body(public void get();)
- But,if a class has at least one abstract method,then the class must be declared abstract.
- If a class is declared abstract,it cannot be instantiated(we cannot create an object).
- To use an abstract class,you have to inherit it from another classs,provide implementations to abstract methods in it.
- If you inherit an abstract class,you have to provide implementations to all the abstract methods in it.

## Encapsulation
Encapsulation in Java is a mechanism of wrapping the data(variables) and code acting on data(methods) together as a single unit.In Encapsulation,the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.

To achieve encapsulation in Java:
- Declare the variables of a class as private.
- Provide **public setter and getter** methods to modify and view the variables values.

Benifits of Encapsulation
- A fields of class be made read-only or write only.
- A class can have total control over what is stored in it's fileds.

### Code to demonstrate use of Encapsulation
```
class Test
{
    private String name;
    private int age;

    public String getname()
    {
        return name;
    }

    public int getage()
    {
        return age;
    }

    public void setname(String nm)
    {
        name=nm;
    }

    public void setage(int ag)
    {
        age=ag;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.setname("Daenish");
        obj.setage(21);

        System.out.println("Name: "+obj.getname());
        System.out.println("Age: "+obj.getage());
    }
}

```
Here,we cannot access private data members name and age directly.So we have to create public getter and setter methods to access the private data members.

## Polymorphism
Polymorphism in Java is a concept by which we **can perform a single action in different ways**.Polymorphism is derived from 2 Greek words:poly[many] and morphs[forms].There are 2 types of polymorphism in java:**compile-time polymorphism** and **run time polymorphism**.
We can perform polymorphism in java by **method overloading and method overriding**.
![Polymorphism in Java](./Photos/poly.png)

## Method Overloading
Method Overloading is a feature that allows a class to have more then one method having the same name,if their argument list are different.It is similar to constructor overloading in Java,that allows a class to have more then one constructor having different lists.
In order to overload a method,the argument lists of the methods  must differ in either of these:
- Number of parameters:
  - add(int,int)
  - add(int,int,int)
- Data type of parameters:
  - add(int,int)
  - add(int,float)
- Sequence of Data type of parameters:
  - add(int,float)
  - add(float,int)
### Code to demonstrate the use of Method Overloading.
```
class Overload
{
    void demo(int a)
    {
        System.out.println("a: "+a);
    }
    void demo(int a,int b)
    {
        System.out.println("a and b: "+a+" "+b);
    }
    double demo(double a)
    {
        System.out.println("double a: "+a);
        return a*a;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Overload obj=new Overload();
        double result;
        obj.demo(10);
        obj.demo(20, 30);
        result=obj.demo(7.7);
        System.out.println("O/P: "+result);
        
    }
}
```
Here the method **demo()** is overloaded 3 times:first method has **1 int** paramter,second method has **2 int** parameters and third one is having double parameter.Which method is to be called is determined by the arguments we pass while calling methods.This happens at the compile time so this type of polymorphism is called **compile time polymorphism**.

## Method Overriding
Declaring a method in **sub class**  which is already present in **parent class** is known as method overiding.Over riding is done so that a child class can give it's own implementation to a method which is already provided by the parent class.In this case the method in parent class is called overridden method and the method in child class is called overriding class.
### Code to demonstrate the use of overriding
```
public class Human {//Parent class
    //Overridden method
    public void eat()
    {
        System.out.println("Human is eating.");
    } 
}

class Boy extends Human
{
    //Overriding method

    public void eat()
    {
        System.out.println("Boy is eating");
    }
    public static void main(String[] args) {
        Boy obj=new Boy();
        //This will call the child class version of eat()
        obj.eat();
    }
}
```

## Rules of method overriding in Java
1.) **Arguments list**:The argument list of overriding method(method of child class) must match the Overridden method(the method of parent class).The data types of the arguments and their sequence should exactly match.

2.) **Access Modifier** of the overriding method(method of subclass) cannot be more restrictive than the Overridden method of parent class.For eg: if the Access modifier of of parent class method is public then overriding method(child class method) cannot be private,
protected and default Access modifier,because all of these three access modifier are more ristricter than public.
### Code to demonstrate the use of method Overriding
```
//Animal.java file ma lakhna 
public class Animal {
    public void sound()
    {
        System.out.println("Animal is making sound");
    }
}
//Horse.java file ma lakhna
class Horse extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Neigh");
    }
    public static void main(String[] args) {
        Animal obj=new Horse();
        obj.sound();
    }
}
```

## Introducing Nested and Inner Classes
In Java,you can define a class within another class.Such class is known as nested class.There are 2 types of nested class you can create in Java.
- Non-Static Nested Class(inner class).
- Static Nested Class.

# Non-Static Nested Class(Inner Class)
It has access to members of the enclosing class(outer class).Since the inner class exists within the outer class,you must instantiate the outer class first,in order to instantiate the inner class.
## Static Keyword
It is used to call the attributes or method without creating the objects.
```
public class StaticKeyword {
 String employeename;
 static String employeeCEO;
 double employeesalary;

 void display()
 {
    System.out.println("Employee name: "+employeename);
    System.out.println("Employee CEO: "+employeeCEO);
    System.out.println("Employe salary: "+employeesalary);
 }

 public static void main(String[] args) {
    StaticKeyword obj1=new StaticKeyword();
    StaticKeyword obj2=new StaticKeyword();

    //Static data initialization
    StaticKeyword.employeeCEO="Daenish";

    obj1.employeename="Ayush";
    obj1.employeesalary=12000;
    obj1.display();

    obj2.employeename="Ashik";
    obj2.employeesalary=20000;
    obj2.display();
 }
}
```then

### @override
It is the condition where child class re-implement the method of parent class.


class Arith..
    addTwoDigit(int a, int b){}

class add.. extends Arith..{

}


clss Main{
    main(){
        add a= new add();
        a.addTwoDigit(4,6);
    }
}
```



# Access modifiers in Java
In Java,**Access modifiers** helps to restrict the **scope of class,constructor,variable,method or data members**.It provide's **security,accessibility** etc to the user depending opon the access modifier used in the element.In Java there are 4 types of access modifiers:
- Default-no keyword required
- Private
- Protected
- Public
![Access Modifiers](photos/Access-Modifiers-in-Java-1.webp)

## Difference between Pass by value and Pass by reference
### Pass by value
- Sends a copy of value.
- it works on data types in premitive data types.

### Pass by refernce
- Sends the actual value.
- It works on objects(non-premitive).

## Private Access Modifiers
The methods or data members declared as private are accessible **only within the class in which they are declared**.In term's of application to classes,**apply only to nested classes and not on top-level classes**.


