//leetcode 11
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int area = 0;
        while(left<right){
            int width = right-left;
            int h = Math.min(height[left] , height[right]);
            //area = Math.max(area, h*width);
            if(h*width > area){
                area=h*width;
            }
            
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return area;
    }
}
