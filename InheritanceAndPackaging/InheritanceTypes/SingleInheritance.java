package InheritanceTypes;

class Animal
{
    void eat()
    {
        System.out.println("eating..");
    }

    void display()
    {
        System.out.println("this is parent class");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("barking");
    }
    
    void eat()
    {
        System.out.println("Dog is eating");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
