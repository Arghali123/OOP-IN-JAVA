package Interface;
interface Parent1 {
void makeSound();
}

interface Parent2 {
void makeSound();

}

class Child implements Parent1,Parent2
{
    public void makeSound()
    {
        System.out.println("Sound of child class");
    }
}
public class InterfaceExample {

    public static void main(String[] args) {
        Child child=new Child();
        child.makeSound();
    }
}