import java.util.Scanner;

class Smallest {

    int displaySmallest(int[] array)
    {
    int smallest=array[0];
    int n = array.length;

        for(int i=1;i<n;i++)
        {
          if(smallest>array[i])
          {
            smallest=array[i];
          }
        }
        return smallest;
    }
}

public class Number {
//     // int[] arr;
//     public int display(int[] arr) {
//         int n = arr.length;
//         int largest = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (largest < arr[i]) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }

    public static void main(String[] args) {
        // int[] numbers = { 3, 23, 4, 34, 4 };
        // Number myNumber = new Number();
        // int result = myNumber.display(numbers);
        // System.out.println("largest: " + result);

        // smallest number
        Smallest mysSmallest=new Smallest();
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=myScanner.nextInt();
        int[] myarray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            myarray[i]=myScanner.nextInt();
        }
        int small=mysSmallest.displaySmallest(myarray);
        System.out.println(small);

        myScanner.close();

    }

}