# Exception
An Exception is an unwanted or unexpected event that occurs during the execution of a program (i.e., at runtime) and disrupts the normal flow of the program’s instructions.

# Error Vs Exception
**Error**: An Error indicates a serious problem that a resonable application should not try to catch.

**Exception**: Exception indicates conditions that a resonable application might try to catch.
An exception can occur for many different reasons. Following are some scenarios where an exception occurs:
- A user entered an invalid data.
- A file needed to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of the memory. 

Some of the exceptions are caused by the user error, others by programmers error, and others by physical resources that have failed in some manner.Based on these we have three category of Exceptions. You need to understand them to know how exception handling works in Java.

1. **Checked Exceptions**: A checked exception is an exception that is checked(notified) by the compilier at the compile time, these are also called as compile time exceptions.These exceptions cannot be simply ignored; the programmer should handle these exceptions.
1. **Unchecked Exceptions**: Occurs at the time of execution.These are also called as **Runtime Exceptions**. These include programming bugs, such as logic error or improper use of an API. Runtime exceptions are ignored by at the time of compilation.
1. **Errors**: These are not exceptions at all, but problems that arises beyond the control of the user or the programmer. Errors are typically ignored in your code because you can rarely do anything about an error. for eg:,if an stack overflow occurs, an error will arise. They are ignored at the time of compilation.

# Hierarchy of Java Exception classes
The **java.lang.Throwable** class is the root class of Java Exception hierarchy which is inherited by two subclasses: Exception and Error.A hierarchy of Java Exception classes are given below:
![Hierarchy of Java Exception classes](./Photos/HierarchyOfJavaExceptionClasses.jpg)

# Java Exception Keywords
# Common Scenarios of Java Exceptions
There are some scenarios where unchecked exceptions may occur. They are as follows:
1. **A scenario where Arthemetic Exception occurs**:
If we divide any number by zero,there occurs an ArthemeticExceptions
```
int a=10/0;//ArthematicExceptions
```

2. **A scenario where NullPointerException occurs**:
If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
```
String s=null;
System.out.println(s.length());//NullPointerException
```

3. **A scenario where NumberFormatException occurs**:
The wrong formatting of any value may occur NumberFormatException. Suppose I have a string variable that has characters, converting this variable into digit will occur NumberFormatException.
```
String s="abc";
int i=Integer.parseInt(s);//NumberFormatException
```

4. **A scenario where ArrayIndexOutOfBoundsException occurs**:
If you are inserting any value in the wrong index, it would result in ArrayIndexOutOfBoundsException as shown below:
```
int a[]=new int[5];
a[10=50];//ArrayIndexOutOfBoundsException
```

## Java finally block
Java finally block is a block that is used to execute important code such as closing connection,stream etc.It is always executed whether exception is handled or not. Java finally block follows try or catch block.

## Java Multi-catch block
A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler. So, if you have to perform different tasks at the occurance of different exceptions, use java multi-catch block.
- At a time only one exception occurs and at a time only one catch block is executed.
- All catch blocks must be ordered from most specific to most general, ie. catch for ArthematicException must come before catch for Exception.


eg 1:
```
public class MultipleCatchBlock1
{
    public static void main(String[] args)
    {
        try
        {
         int a[]=new int[5];
         a[5]=30/0;
        }catch(ArthemeticException e)
        {
          System.out.println("Arthematic exception occurs.");
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds exception occurs.");
        }catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code"); 
    }
}
//output
Arthematic exception occurs.
rest of the code
```

eg2:
```
public class MultipleCatchBlock2
{
    public static void main(String[] args)
    {
        try
        {
            int a[]=new int[5];
            System.out.println(a[10]);
        }catch(ArthematicException e)
        {
            System.out.println("Arthematic exception occurs.");
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException exception occurs.");
        }catch(Exception e)
        {
            System.out.println("Parent exception occurs.");
        }
        System.out.println("rest of the code");
    }
}
//output
ArrayIndexOutOfBoundsException exception occurs.
rest of the code
```

## Java Nested try block
The try block within a try block is known as nested try block in java. Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.

syntax:
```
... 
try
{
    statement 1;
    statement 2;
    try
    {
        statement 1;
        statement 2;
    }catch(Exception e)
    {
        ...
    }
}catch(Exception e)
{
    ...
}
```

## Java throw keyword
The java **throw** keyword is used to explicitly throw an exception. We can throw either checked or unchecked exception in java by throw keyword. The throw keyword is mainly used to throw custom exception.The syntax 
```
throw new method_name("message");
```
eg: We have created the validate method that takes an integer value as a parameter. If the age is less than 18, we are throwing the ArthematicException otherwise print message welcome to vote.
```
public class ThowUse {
    static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not valid age.");
        }else
        {
            System.out.println("You are welcome to vote.");
        }
    }
    public static void main(String[] args) {
        validate(12);
        System.out.println("rest of the code...");
    }
}
```

## Java throws keyword
The **Java throws keyword** is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.

**syntax of java throws**
```
return_type method_name() throws exception_class_name
{
    //method code 
}
```

## Difference between throw and throws in Java
### throw
- Java throw keyword is used to explicitly throw an exception.
- Checked exception cannot be propagated using throw only.
- Throw is followed by an instance.
- Throw is used within the method.
- You cannot throw multiple exceptions.

### throws
- Java throws keyword is used to declare an exception.
- Checked exception can be propagated with throws.
- Throws is followed by class.
- Throws is used with the method signature.
- You can declare multiple exceptions eg: public void method() throws IOException,SQLException.
