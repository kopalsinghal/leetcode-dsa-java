

public class binary_search {
    public static void main(String[] args) {
        
        int nums[] = { 1,3,10,24,36};
        int target = 24;
        int low = 0;
        int high = nums.length-1;
        
        for(int i = 0 ; i < nums.length;i++){
            int mid = low + ( high-low)/2;
            if(nums[mid]==target){
                System.out.println("target found at index " + mid);
                
            }
            else if(nums[mid] > target){
                high = mid -1;
                System.out.println("target found at index " + mid);
                
            }
            else{
                low = mid +1;
                System.out.println("target found at index " + mid);
                
            }
        }
    }
}
