//leetcode 2678
class Solution {
    public int countSeniors(String[] details) {
        int peopleGreaterThan60 = 0 ;
         for(String detail : details){
            if(detail.charAt(11) > '6' || detail.charAt(11) == '6' && detail.charAt(12) > '0' ){
                peopleGreaterThan60++;
            }
         }
         return peopleGreaterThan60;
    }
}
