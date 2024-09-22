//leetcode 128
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        // if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int count=1;
        int maxcount = 0;
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i]+1 == nums[i+1]){
                count++;
            }
            else if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                if(count>maxcount) maxcount=count;
                count=1;
            }
        }
        if(count>maxcount) maxcount=count;
        return maxcount;
    }
}
