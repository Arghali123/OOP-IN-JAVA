package AccessControl;
class Daenish
{
    private void display()
    {
        System.out.println("Hello my name is daenish arghali");
    }
}
class Private {
public static void main(String[] args) {
    Daenish obj=new Daenish();
    obj.display();//Shows compile time error when trying to access a private method from Daenish although being from same package.

}
    
}