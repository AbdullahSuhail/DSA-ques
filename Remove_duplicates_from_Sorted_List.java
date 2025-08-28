    // question 83  

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        

if(head==null) return null;



        ListNode temp=head ;
        ListNode curr=head; 

        curr=temp.next;


        while(curr!=null)
        {

        if(temp.val==curr.val){
                     
          curr=curr.next;

        }
        else{
         temp.next=curr;

         temp=curr;

         curr=temp;


        }



        }

        temp.next=null;
      
        return head;
    }
}