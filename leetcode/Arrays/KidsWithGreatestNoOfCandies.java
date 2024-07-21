class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        //finding maximum
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<candies.length ; i++){
            max = Math.max(max , candies[i]);
        }
    
        
        for (int i=0 ; i<candies.length ; i++){
            if(candies[i]+extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
