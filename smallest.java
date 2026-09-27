package arrays;

public class smallest {
    public static void main(String[] args) {
        
    int arr[] = {2,4,10,1,20};
    int smallest = arr[0];
    for(int i = 0; i < arr.length ; i++){
        if(arr[i] < smallest){
            smallest = arr[i];
        }
    }
    System.out.println(smallest);
}
}
