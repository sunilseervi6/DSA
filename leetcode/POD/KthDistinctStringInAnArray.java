//leetcode 2053
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> distinct = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        for(String str : arr){
            if(distinct.contains(str)){
                distinct.remove(str);
                duplicates.add(str);
            }
            if(duplicates.contains(str)){
                continue;
            }
            else{
                distinct.add(str);
            }
        }
        for(String str : arr){
            if(!duplicates.contains(str)){
                k--;
            }
            if(k==0){
                return str;
            }
        }
        return "";


    }
}
