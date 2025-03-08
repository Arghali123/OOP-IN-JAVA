package NestedClass.StaticExample;
class MotherBoard
{
    //static nested class
    static class USB
    {
        int usb2=2;
        int usb3=1;
        int getTotalPorts()
        {
            return usb2+usb3;
        }
    }
}
public class StaticUse
{
  public static void main(String[] args) {
    //Creating an obj of USB(nested class) by the help of outer class(MotherBoars).
    MotherBoard.USB myUsb=new MotherBoard.USB();
    System.out.println("Total Ports: "+myUsb.getTotalPorts());
  }
}
