public class DublicateArray {
    public static void main(String[] args) {
      int[] arr= {4,3,3,5,6,6,5,5};

      int[] res= search(arr, 5);

      for(int e: res){
        System.out.print(e+" ");
      }
    }


    public static int[] search(int[] arr, int key){
        int count=0;
        int[] resArr= new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(arr[i]== key){
                resArr[count++]= i;
            }
        }


        return resArr;
    }
}
