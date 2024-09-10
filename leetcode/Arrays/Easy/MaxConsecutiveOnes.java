//leetcode 485
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                if(count > max){
                    max = count;
                    
                }
                count =0 ;
                
            }
        }
        return (count>max)?count:max;
    }
}
