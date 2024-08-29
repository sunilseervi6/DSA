//leetcode 3264
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int j=0 ; j<k ; j++){
            int index = 0;
            int min = nums[0];
            for(int i=0 ; i<nums.length ; i++){
                if(nums[i] < min){
                    min = nums[i];
                    index=i;                
                }
            }
            int m = multiplier*min;
            nums[index] = m;
        }
        return nums;
    }
}
