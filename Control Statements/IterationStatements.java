public class IterationStatements {
   public static void main(String[] args) {
    //1.)for loop:
    //The below Java program demonstrates a for loop that prints numbers from 0 to 10 in a single line.
    for(int i=0;i<=10;i++)
    {
        System.out.print(i+" ");
    }
    System.out.println("\n");
    int arr[]={12,21,1,2,6};
    for(int i:arr)
    {
        System.out.print(i+" ");
    }
   } 
}
