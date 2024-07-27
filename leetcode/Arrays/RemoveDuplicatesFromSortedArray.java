//leetcode 26
/*class Solution {
    public int removeDuplicates(int[] nums) {
       int j=1;
       for(int i=1 ; i<nums.length ; i++){
        if(nums[i] != nums[i-1]){
            nums[j] = nums[i];
            j++;
        }
       }
       return j;

    }
}
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
       int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}

