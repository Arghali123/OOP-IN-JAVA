public class Question20 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        int searchElement=7;
        while(start<end)
        {
            if(arr[mid]==searchElement)
            {
                System.out.println("Element found in the array.");
                break;
            }
            if(arr[mid]<searchElement)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            mid=(start+end)/2;
        }
    }
}
