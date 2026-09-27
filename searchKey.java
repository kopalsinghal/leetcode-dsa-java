package arrays;

public class searchKey {
    public static void main(String[] args) {
        
        int arr[] = {2,4,3,5,7};
        int key = 5;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                System.out.println("key found at index " + i);
            }
            else{
                System.out.println("key not found");
            }
        }
    }
}
