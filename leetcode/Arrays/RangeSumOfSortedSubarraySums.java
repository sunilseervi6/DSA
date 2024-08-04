//leetcode 1508
//brute force approach
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int s = n * (n+1) / 2;
        int arr[] = new int[s];
        
        
        for(int i=0 , k=0; i<n ; i++){
            int sum =0;
            for(int j=i ; j<n ; j++){
                sum += nums[j];
                arr[k++] = sum;
                
            }
        }
        Arrays.sort(arr);
        int nsum = 0;
        final int mod = (int) 1e9 +7;
        for(int i=left-1 ; i<right ; i++){
            nsum = (nsum + arr[i]) % mod;
        }
        return nsum;
    }
}
