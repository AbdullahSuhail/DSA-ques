// Question 82

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

  if (head == null) return null;
 
        ListNode prev = new ListNode(-1);

        ListNode answer=prev;


        ListNode curr = head;

        while (curr != null)
         {
           
            if (curr.next != null && curr.val == curr.next.val) 
            
            {
                
                while (curr.next != null && curr.val == curr.next.val)
                 {
                    curr = curr.next;
                }
              
                prev.next = curr.next;
            }
             else
              {

                 prev.next = curr;

                prev = prev.next;  
               
            }
            curr = curr.next;
        }

        return answer.next;
    
    
    
    
    }
}