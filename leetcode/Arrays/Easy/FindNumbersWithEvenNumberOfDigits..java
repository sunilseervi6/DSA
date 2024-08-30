//leetcode 1295
//Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums){
            int noOfDigits =digits(num);
            if(noOfDigits %2 == 0)  count++;
        }
        return count;
        
    }
    int digits(int num){ 
        //edge cases
        if(num < 0) num = num*-1;
        if(num == 0) return 1;
        return (int)(Math.log10(num))+1;
        // int count =0;
        // while(num>0){
        //     count++;
        //     num=num/10;
        // }
        // return count;
    }
}
