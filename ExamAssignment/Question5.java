/*
Create a base class Animal with a method makeSound(). Derive two
classes Dog and Cat that override makeSound(). Demonstrate
polymorphism using method overriding.
 */

class Animal
{
    void makeSound()
    {
      System.out.println("Animal is making sound");
    }
}
class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Dog is making sound");
    }
}
class Cat extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Cat is making sound");
    }
}
public class Question5 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.makeSound();;

        Cat cat=new Cat();
        cat.makeSound();
    }
}
