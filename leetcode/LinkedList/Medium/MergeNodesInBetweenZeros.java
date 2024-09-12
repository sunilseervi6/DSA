//leetcode 2181
/** 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head.next;
        ListNode temp = node;
        while(temp!=null){
            //find sum within the block
            int sum = 0;
            while(temp.val != 0){
                sum +=temp.val;
                temp = temp.next;
            }
            //update sum
            node.val = sum;
            //move temp to the next block
            temp = temp.next;
            //connect the next block
            node.next = temp;
            //move node to the next block
            node = temp;
        }
        //skip the head of the linkedlist because head of input list isalways zer0
        head = head.next;
        return head;
    }
}
