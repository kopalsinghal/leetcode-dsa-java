

public class sorted {
    public static void main(String[] args) {
        
        int arr[] =  {2,4,5,7};
        boolean sorted = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i + 1]){
                sorted = false;
                System.out.println("not sorted");
                break;
            }
            else{
                System.out.println("sorted");
            }
        }
        
    }
}
