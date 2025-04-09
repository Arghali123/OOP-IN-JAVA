package DynamicMethodDispatch;
abstract class Animal
{
    //abstract method
    abstract void makeSound();

    void sleep()//Concrete method:just normal method
    {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Cat meows");
    }
}

public class DMDusingAbract {
    //An absract class can have both abstact(without body) and concrete method.
    public static void main(String[] args) {
        Animal animal;

        animal=new Dog();
        animal.makeSound();

        animal=new Cat();
        animal.makeSound();
    }
}
