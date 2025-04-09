public class CommandLineExample 
{

    public static void main(String[] args) {
        // for(String num:args)
        // {
        //     System.out.println(num+" ");
        // }

        for(int i=0;i<=args.length;i++)
        {
            System.out.print(args[i]+" ");
        }
    }
}