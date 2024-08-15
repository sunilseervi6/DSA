//leetcode 860
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollar =0  , tenDollar =0;
        for(int x : bills){
            if(x == 5){
                fiveDollar++;
            }
            else if(x == 10){
                if(fiveDollar > 0 ){
                    fiveDollar--;
                    tenDollar++;
                }
                else {
                    return false;
                }
            }
            else{
                if(fiveDollar >0 && tenDollar>0){
                    fiveDollar--;
                    tenDollar--;
                }
                else if(fiveDollar > 2){
                    fiveDollar -= 3;
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
    }
}
