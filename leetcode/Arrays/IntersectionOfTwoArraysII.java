//leetcode 350
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
         int i= 0;
         int j=0;
         while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                al.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }

         }
         int result[] = new int[al.size()];
         for(int k=0 ; k<al.size();k++){
            result[k] = al.get(k);
         }
         return result;
    }
}
