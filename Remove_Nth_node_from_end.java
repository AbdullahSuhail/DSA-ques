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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode ahead=head;


        // ListNode behind=head;

        ListNode behind=null;

        // ListNode answer=head;

        if(head.next==null) return null;
        for(int i=1;i<n;i++){

            ahead=ahead.next;

        }
        while(ahead!=null && ahead.next!=null){
if(behind==null){
    ahead=ahead.next;
    behind=head;
}
      
      else{
 
            ahead=ahead.next;
            behind=behind.next;

      }
        }


        if(behind==null){
            return head.next;
        }

      behind.next=behind.next.next;
      



        return head;


 
        
    }
}