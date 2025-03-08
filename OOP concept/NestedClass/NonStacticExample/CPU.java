
//Non-stactic nested class(innner class)

public class CPU {//Parent class
    
    double price;

    //child class
    class Processor
    {
        //members of nested class
        double cores;
        String manufacturer;
        double getCache()
        {
            return 4.3;
        }
    }

    //child class
    protected class RAM
    {
        //member of protected nested class
        double memory;
        String manufacturer;
        double getClockSpeed()
        {
            return 5.5;
        }
    }

    public static void main(String[] args) {
        //Create object of Outer class CPU
        //Since the inner class exists within the outer class, you must instantiate the outer class first,
        // in order to instantiate the inner class.
        CPU cpu=new CPU();

        //create a object of innerclass Processor using outer class
        CPU.Processor processor=cpu.new Processor();

        //Create a object of innerclass RAM using outer class CPU
        CPU.RAM ram=cpu.new RAM();

        System.out.println("Processor Cache: "+processor.getCache());
        System.out.println("RAM Clock Speed: "+ram.getClockSpeed());
    }
}
