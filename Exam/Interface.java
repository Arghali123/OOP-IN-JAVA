import java.nio.channels.Pipe.SourceChannel;

interface Animal
{
    int legs=4;
    String type="Mammel";

    void sound();
}

class Cat implements Animal
{
    public void sound()
    {
        System.out.println("cat is making a sound");
        System.out.println("Cat has "+legs+" legs");
    }
}

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog is making a sound");
        System.out.println("Dog type is "+type);
    }
}

public class Interface {
  public static void main(String[] args) {
    Animal a;//Interface reference

    a=new Dog();
    a.sound();

    a=new Cat();
    a.sound();
  }
}
