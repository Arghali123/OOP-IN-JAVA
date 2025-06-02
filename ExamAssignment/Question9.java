/*
Implement a MusicInstrument interface with a method play(). Create Guitar and Piano classes implementing play(). Demonstrate
runtime polymorphism.
 */
interface MusicInstrument
{
    void play();
}
class Guitar implements MusicInstrument
{
    public void play()
    {
        System.out.println("I can play guitar");
    }
}
class Piano implements MusicInstrument
{
    public void play()
    {
        System.out.println("I can't play piano");
    }
}
public class Question9 {
    public static void main(String[] args) {
        Guitar guitar=new Guitar();
        guitar.play();

        Piano piano=new Piano();
        piano.play();
    }
}
