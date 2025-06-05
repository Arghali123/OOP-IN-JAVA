import java.util.Random;

public class RandNumGeneration {
    public static void main(String[] args) {
        Random rand=new Random();

        //obtain a number between [0-99]
        int n=rand.nextInt(100);
        System.out.println("Random number is : "+n);
    }
}
