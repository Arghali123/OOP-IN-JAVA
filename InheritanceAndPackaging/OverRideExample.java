class Animal
{
    void makesound()
    {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal
{
    @Override
    void makesound()
    {
        System.out.println("Dog barks");
    }
}
public class OverRideExample {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makesound();

        Dog dog=new Dog();
        dog.makesound();
    }
}
