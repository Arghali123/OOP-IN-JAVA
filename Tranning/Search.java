import java.util.Scanner;

public class Search {

    public void Searching(int[] array,int key)
    {
       int n=array.length;
       boolean found=false;
       int index=-1;
       for(int i=0;i<n;i++)
       {
        if(key==array[i])
        {
          found=true;
          index=i;
          break;
        }
       }
       if(found)
       {
        System.out.print("Key is found at index: "+index);
       }
       else
       {
        System.out.println("Key is not int the array");
       }
    }
 public static void main(String[] args) {
    int[] array={22,33,3,4,2};
    Scanner myScanner=new Scanner(System.in);
    System.out.print("Enter the key: ");
    int key=myScanner.nextInt();
    
    Search mySearch=new Search();
    mySearch.Searching(array, key);
    myScanner.close();
 
 }  

}
