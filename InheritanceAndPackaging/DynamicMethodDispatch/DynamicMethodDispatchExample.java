// package DynamicMethodDispatch;
class Animal
{
    void makeSound()
    {
        System.out.println("This is animal");
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
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
      Animal animal;
      animal=new Dog();
      animal.makeSound();

      animal=new Cat();
      animal.makeSound();
    }
}
