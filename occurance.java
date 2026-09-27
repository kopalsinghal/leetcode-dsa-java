package arrays;

public class occurance {
    public static void main(String[] args) {
        int arr[] ={2,1,3,2,6};
        int count = 0;
        int target = 2;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                count ++;
            }
        }
        System.out.println(count);
    }
}
