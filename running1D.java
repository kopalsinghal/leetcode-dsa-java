public class running1D {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int sum =0;
        int[] runningsum= new int[2*nums.length];
        for(int i=0; i<nums.length;i++){
            sum = sum + nums[i];
            runningsum[i] = sum;
        }
        System.out.println(runningsum);
    }
}
