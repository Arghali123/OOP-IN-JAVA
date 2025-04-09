public class VolumeCommandLine {
    public static void main(String[] args) {
        double Volume=1;
        for(int i=0;i<args.length;i++)
        {
            Volume=Volume*Double.parseDouble(args[i]);
        }
        System.out.println("Volume:" +Volume);
    }
}
