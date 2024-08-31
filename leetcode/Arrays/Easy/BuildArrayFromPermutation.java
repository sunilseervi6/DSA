//leetcode 1920
https://leetcode.com/problems/build-array-from-permutation/
class Solution {
    public int[] buildArray(int[] nums) {
        int n  = nums.length;
        int[] ans  = new int[n];
        for(int i=0 ; i<nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
