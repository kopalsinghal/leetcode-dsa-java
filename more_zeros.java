package arrays;

public class more_zeros {
    public static void main(String[] args) {
        int arr[] = {2,0,4,0,5,};
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i = j ; i < arr.length; i++){
            arr[i] = 0;

        }
        for(int i =0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
