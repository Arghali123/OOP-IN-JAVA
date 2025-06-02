//Sort an array using insertion and selection sort in ascending and descending order respectively.

public class Question18 {

    public static void main(String[] args) {

        //Insertion sort
       int[] array={12,1,3,46,33,67};
       for(int i=1;i<array.length;i++)
       {
        int key=array[i];
        int j=i-1;
        while(j>=0 && array[j]>key)
        {
            array[j+1]=array[j];
            j--;
        }
        array[j+1]=key;
       }
       System.out.println("Sorting through insertion sort.");
       for(int val:array)
       {
        System.out.print(val+" ");
       }

       //Selection sort
       int[] selection={12,3,2,1,34,22};
       int size=selection.length;
       for(int i=0;i<size-1;i++)
       {
        int minIndex=i;
        int minValue=selection[i];
        for(int j=i+1;j<size;j++)
        {
            if(minValue>selection[j])
            {
                minIndex=j;
                minValue=selection[j];
            }
        }
        int temp=selection[i];
        selection[i]=minValue;
        selection[minIndex]=temp;
       }

       System.out.println("Sorting throught selection sort.");
       //Display of selection method
       for(int val:selection)
       {
        System.out.print(val+" ");
       }
    }
}
