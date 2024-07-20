//LeetCode problem 1605
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int r = 0;
        int c = 0;
        int resMatrix[][] = new int[rows][cols];
        while(r<rows && c<cols){
            int minValue = Math.min(rowSum[r] , colSum[c]);
            resMatrix[r][c] = minValue;
            rowSum[r] -= minValue;
            colSum[c] -= minValue;
            if(rowSum[r] == 0){
                r++;
            }
            else{
                c++;
            }
        }
        return resMatrix;
    }
}
