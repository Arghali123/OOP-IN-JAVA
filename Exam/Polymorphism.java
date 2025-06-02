package Exam;

import javax.sound.sampled.SourceDataLine;

class Overloading
{
    int add(int a,int b)
    {
        return a+b;
    }

    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Cat extends Animal
{
    @Override
    void eat()
    {
        System.out.println("Cat is eating");
    }
}

public class Polymorphism {
    //Divided into 2 parts:
    //1.)Method overloading(compile time)
    //2.)Method over-riding(run time)

    public static void main(String[] args) {
        //Method overloading
        Overloading overloading=new Overloading();
        System.out.println("Method overloading1: "+overloading.add(5, 10));
        System.out.println("Method overloading2: "+overloading.add(5, 10,15));

        //Method over riding
        Cat cat=new Cat();
        cat.eat();
    }

}
