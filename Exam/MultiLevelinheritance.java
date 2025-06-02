class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

class Babydog extends Dog
{
    void weep()
    {
        System.out.println("Baby dog is weeping");
    }
}

public class MultiLevelinheritance {

    public static void main(String[] args) {
       Babydog d=new Babydog();
       d.weep();
       d.bark();
       d.eat(); 
    }
}