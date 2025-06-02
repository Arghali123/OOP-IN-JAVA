public class JaggedArrayExample {
/*
A jagged array in Java is a 2D array where each row can have a different number of columns. It's an array of arrays, and each sub-array 
can be of a different length.
 */   

public static void main(String[] args) {
    int[][] jaggedArray={
        {1,2,3},
        {4,5},
        {6,7,8,9}
    };

    //;Display and sum
    for(int i=0;i<jaggedArray.length;i++)
    {
        System.out.print("Row: ");
        int rowSum=0;
        for(int j=0;j<jaggedArray[i].length;j++)
        {
            System.out.print(jaggedArray[i][j]+" ");
            rowSum+=jaggedArray[i][j];
        }
        System.out.println(" | Sum: "+rowSum);
    }
}

}
