public class sortedsq {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;
        int result[] = new int[nums.length];
        while(left <= right){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];
            if(leftsq > rightsq){
                result[index] = leftsq;
                left++;
            }
            else{
                result[index] = rightsq;
                right--;
            }
            index--;
        }
        System.out.println(java.util.Arrays.toString(result));
    }
}
