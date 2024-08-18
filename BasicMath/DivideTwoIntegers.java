//leetcode 29
class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor < 0 && dividend < 0) {
            int j = (dividend) / (divisor);
            if (j == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return j;
            }
        }
        return dividend / divisor;
    }
}
