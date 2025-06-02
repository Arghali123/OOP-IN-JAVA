public class Q19 {
    public static void main(String[] args) {
        int[] arr= {2,3,-4,0,4};
        int sum= Integer.MAX_VALUE, minSum= Integer.MAX_VALUE;
        
        int[] result= new int[2];
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length; j++){
                sum= arr[i]+ arr[j];

                if(Math.abs(sum)<minSum && i != j){
                    minSum= Math.abs(sum);
                    result[0]= i;
                    result[1]= j;
                }
            }
        }

        for(int a: result){
            System.out.println(a+" ");
        }
    }
}
