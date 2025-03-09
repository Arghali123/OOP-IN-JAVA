# Introduction
The process by which one class acquires the properties of(data members) and functionalities(methos) of another class is called **inheritance**.
- Aim: Reuseabilty of code,so that a class has to write only the unique features and rest can be extended from the another class.
- Inheritance represents the **IS-A relationship** which is also known as a *parent-child relationship*.
- Inheritance is used in Java for the following.
  - For method Overriding(so run time polymorphism can be achieved).
  - For code reuseabilty.

## Terms used in Inheritance
- **Class**:A class is a group of objects which have a common properties.It is a template or blueprint from which objects are created.
- **Sub Class/Child Class**:It is class which inherits the other class.Also called derived class,extended class or child class.
- **Super Class/Parent Class**:It is the class from where a subclass inherits the features.Also called base class.
- **Reuseability**:It is a mechanism which facilates you to reuse the fields and methods of the existing class when you create a new class.

## The syntax of Java Inheritance
```
class Subclass-name extends Superclass-name
{
    //methods or fields
}
```

The **extends keyword** indicates  that you are making a new class that derives from an existing class.The meaning of **extends** is to *increase the functionality*.

# Types of inheritance in Java
- On the basis of class,there are 3 types of inheritance in Java:
  - single
  - multilevel
  - hierarchical

In java,**multiple and hybrid inheritance** is supported through **interface only**.

## Single Inheritance
![Single Inheritance](./Images/SingleInheritance.jpg)
```
public class A
{
    ...
}
public class B extends A
{
    ...
}
```

## Multilevel Inheritance
![Multilevel Inheritance](./Images/MultiLevelInheritance.jpg)
```
public class A {...}
public class B extends A{...}
public class c extends B{...}
```

## Hierarchical Inheritance
![Hierarchical Inheritance](./Images/HierarchicalInheritance.jpg)
```
public class A {...}
public class B extends A {...}
public class C extends A {...}
public class D extends A {...}
```

## Multiple Inheritance
![Multiple Inheritance](./Images/MultipleInheritance.jpg)
```
public class A {...}
public class B {...}
public class extends A,B {...}//Java does not support
```

## Hybrid Inheritance
![Hybrid Inheritance](./Images/HybridInheritance.jpg)
```
Java does not support.
```
