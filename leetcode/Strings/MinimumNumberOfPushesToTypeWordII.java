
//leetcode 3106
class Solution {
    public int minSwaps(int[] nums) {
        //window size of count 1
        int windowSize = 0 ;
        for(int num : nums){
            windowSize += num;
        }
        //find zeros in 1st window
        int currZeros = 0;
        for(int i=0 ; i<windowSize ; i++){
            if(nums[i] == 0){
                currZeros++;
            }
        }
        //for the remaining windows
        int minZeros = currZeros;
        int start = 0 ;
        int end = windowSize-1;
        int n = nums.length;
        while(start < n){
            //if removed element was zero decrement 0 counter
            if(nums[start] == 0){
                currZeros--;
            }
            start++;
            //if included element is 0 increment 0 counter
            end++;
            if(nums[end % n] ==0 ){
                currZeros++;
            }
            minZeros = Math.min(minZeros , currZeros);
        }
        return minZeros;

    }
}
