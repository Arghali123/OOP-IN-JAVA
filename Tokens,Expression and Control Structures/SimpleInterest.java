//import java.nio.channels.Pipe.SourceChannel;

public class SimpleInterest {

    public static void main(String[] args) {
        double sum=1;
        for(int i=0;i<args.length;i++)
        {
            sum=sum*Double.parseDouble(args[i]);
        }
        System.out.println(sum);
        double si=sum/100.00;
        System.out.println("Simple Interest: "+si);
    }
}