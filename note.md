# Introduction to Java[Unit-1]
Java is an object-oriented,cross platform,multi-purpose programming language produced by **Sun Microsystem**.It is a combination of features of C and C++ with some additional concepts.Most Java programs contains classes,which are used to define objects,and methods,which are assigened to individual classes.Java is also known for being stricter then C++,meaning variables and functions must be explicitly defined.This means Java source code may produce errors or "exceptions" more easily then any other language.
> [!important]
Oracle acquired Sun Microsystem in Jan 2010.Therefore,Java is maintained and distributed by Oracle.

## Features of Java
- Object-Oriented:
- Platform independent: Programs written in one operating system can be able to run in any Operating System
- Simple: Include's may features of C/C++,which make's it easy to understand.
- Secure: Java provides a wide range of protection from viruses and malicious programs.
- Portable: Running the same program with Java on different platforms is possible.
- Robust: During the devlopment of the program,it helps us to find possible mistake's as soon as possible.
- Multi-threaded:It allows to write a program that performs several different tasks simultaneously.
- Distributed: Java is designed for distributed internal enviroments as it manages the TCP/IP protocal.

## History of Java
- 1990 James Gosling(Devloper of Java).
- Platform independent language(OAK).
- 1995 consistency.
- Applets(it was used to create GUI applications,animation,play sounds).
- JavaFX and Swing (used to creating GUI applications).

## Java Virtual Machine(JVM)
- JVM as it's name suggest is "virtual" computer that resides in the "real" computer as a software process.
- JVM  give's java the flexibilty of platform indpendence.
- JVM reads "byte code",interpret it and execute the program.

![Jvm](/Photos/Jvm.png)

## Procedure-Oriented Vs Object-Oriented Programming
![Procedure vs Object Oreiented Programmig](/Photos/ProcedureVsObject.PNG)

> Note:Java is a Statically-Typed-Language which means every variable must have specific data types before use.Jun data type
declare gara xam tei type ko data rakhnu parxa.
Java is case sensitive

- **Datatypes**:The type of data that a variable can  hold.
- **Variables**:are container where we can store values.


# Tokens,Expressions and Control Structures[Unit 2]
## Primitive Data Types
- Most basic data types available within the Java Language.
- 8 primitive data types:boolean,byte,char,short,int,long,float and double.
- Serves only one purpose-containing pure,simple values of a kind.
- Are defined into the system by default ,they come with a number of operations predefined.
![Primitive data types in Java](/Photos/primitivedataTypes.jpg)


Data types are divided into 2 groups:
- Primitive data types:boolean,byte,char,short,int,long,float and double.
- Non-primitive data types:These datatypes refer's to objects or arrays.
## Non-primitive data types:
```
        //1.)String:Sequence of characters.
        String collageName="Nepathya collage";
        System.out.println(collageName);

        //2.)Array:Collection of elements with same data type
        int[] arrayOfNumbers={1,2,3,4,5};
       // System.out.println(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));

        //3.) Class:Instance of an object

        //4.) Enum:Constant values in object(e.g dropdown in Gender field)
```
## User Defined Data Types
User defined data types are those that user/programmer himself defines.for e.g:
```
MyClass obj
Here obj is a variable of data type MyClass and we call them reference variable as they can be used to store the
reference to the object of that class.
```
## Type Conversion and Casting
Conversion of one data type to another data type is called **type casting**.
### Java's Automatic Conversion
When one type of data is assigned to another type of variable,an automatic type conversion will take place if the following two condition's are met:
- The two types are compatible(eg:assigning an **int** value to a **long** variable).
- The destination type is larger then the source type.
## Casting Incompatible Types
To create a conversion between two incompatible types,you must use a cast.A case is simply an explicit type conversion.It has this general form.*(target-type)value*.
```
//Demonstrate cast
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i=257;
        double d=323.142;

        System.out.println("\nConversion of int to byte");
        b=(byte)i;
        System.out.println("i and b: "+i+" "+b);

        System.out.println("\nConversion of double to int");
        i=(int)d;
        System.out.println("d and i: "+d+" "+i);

        System.out.println("\nConversion of double to byte.");
        b=(byte)d;
        System.out.println("d and b: "+d+" "+b);
    }
}
```
## Garbage Collection
Java garbage collection is the process by which Java programs performs automatic memory management. Java programs compile to byte code that can be run on a JVM.When Java programs run on the JVM,objects are created on the heap,which is the portion of memory dedicated to the program.Eventually,some object's will no longer be needed.The garbage collector find's these unused objects and deletes them to free up memory.

Generally,an object become eligible for garbage collection in Java on following cases:
- All reference to that object explicitly set to null eg: object=null.
- The object is created inside a block and reference goes out scope once control exit that block.
- Parent object set to null if an object hold the reference to another object and when you set container object's reference to null,child or contained object automatically becomes eligible for garbage collection.

# Control Statements 
A programming languages uses control statements to cause the flow of execution to advance and branch based on changes to the state of a prorgam.Java's program control statement can be put into the following categories:
*selection,iteration and jump.*

### Java's Selection Statements
Java supports two selection statements:if and switch.These statements allows you to control the flow of your program's execution based upon condition's known only during run time.
1.) if statement
```
syntax:
if(condition)statement1;
else statement2;
```

2.) Nested if statement

```
syntax:
if (condition)
statement1;

else if(condition)
statement2;

else if(condition)
statement3;

else
statement4;
```

3.) Switch Statement
```
syntax:
switch(expression)
{
    case value1:
    //statement sequence
    break;

    case value2:
    //statement sequence
    break;

    case value3:
    //statement sequence
    break;

    case valueN:
    //statement sequence
    break;

    default:
    default statement sequence
}
```

### Java's Iteration Statements
Java's iteration statements are *for,while and do-while*.A loop repeatedly execute's the same set of instructions until a termination condition is met.A loop statement allows you to execute a statement or group of statements multiple times.

1.) **for loop:**A *for loop* is useful when you know how many time's a task is to be repeated.
```
syntax:
for(initialization;boolean_expression;update)
 {
    //statements
 }
```