//leetcode 3282
class Solution {
    public long findMaximumScore(List<Integer> nums) {
        int i = 0 ;
        long val = 0L ;
        for(int j=1; j<nums.size()-1 ; j++){
            if(nums.get(j) > nums.get(i)){
                long value = (long)nums.get(i);
                long mul = (long)j-i;
                val = val +((long)mul*val);
                i = j;
            }
        } 
        long value = (long)nums.get(i);
        long mul = ((long)nums.size()-1)-i;
        return val+((long)mul*value);
    }
}
