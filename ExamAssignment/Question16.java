import java.util.Arrays;
/*
Find the Kth Smallest Element:
 -Given an array of n integers and a number k, find the kth smallest element using sorting.
 */
class KthSmallestElement
{
 public static int findKthSmalest(int[] arr,int k)
 {
    Arrays.sort(arr);
    return arr[k-1];
 }
}

public class Question16 {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k=3;
        System.out.println("Kth smallest element is: "+KthSmallestElement.findKthSmalest(arr, k));
    }
}
