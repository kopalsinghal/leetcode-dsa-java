package arrays;

public class secondLargest {
    public static void main(String[] args) {
        int arr[] = {20,10,35,25,60};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            
        }
        System.out.println(secondLargest);
    }
}
