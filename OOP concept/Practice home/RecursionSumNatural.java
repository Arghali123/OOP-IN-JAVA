public class RecursionSumNatural {
    static int SumNatural(int n)
    {
      if(n==1)
      {
        return 1;
      }
      return n+SumNatural(n-1);
    }
    public static void main(String[] args) {
        int result=SumNatural(5);
        System.out.println("The sum of natural number: "+result);
    }
}