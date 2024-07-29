//eetcode 1395 Medium prolem
class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count =0;
        for(int mid=1 ; mid<n-1 ; mid++){
            int leftSmallerCount = 0;
            for(int i=0 ; i< mid ; i++){
                if(rating[i] < rating[mid]){
                    leftSmallerCount++;
                }
            }
            int rightGreaterCount = 0;
            for(int i=mid+1 ; i< n ; i++){
                if(rating[i] > rating[mid]){
                    rightGreaterCount++;
                }
            }
            //increasing elements count
            count += leftSmallerCount *rightGreaterCount;
            //for decreasing
            int leftGreaterCount= mid - leftSmallerCount;
            int rightSmallerCount= (n-mid-1) - rightGreaterCount; //rightTotalCount - rightGreaterCount = rightSmallerCount
            //decreasing elements count
            count += leftGreaterCount * rightSmallerCount;
        }
        return count;
    }
}
