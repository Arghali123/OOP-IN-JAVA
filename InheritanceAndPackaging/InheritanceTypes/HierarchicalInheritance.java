package InheritanceTypes;
class Animal
{
    void eat()
    {
        System.out.println("Animal eats.");
    }
}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat does meow meow.");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.meow();;
        cat.eat();

        Dog dog=new Dog();
        dog.bark();
        dog.eat();
    }
}
