public class CubeExample {
    static int length;

    static int calculateVolumeCube()
    {
        return length*length*length;
    }
    public static void main(String[] args) {
        CubeExample.length=10;
        int result=CubeExample.calculateVolumeCube();
        System.out.println("Volume of cube: "+result);
    }
}
