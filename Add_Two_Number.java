class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // return null;


        ListNode head1=l1;

        ListNode head2=l2;


    ListNode dummy=new ListNode(-1);


    // ListNode curr=dummy;

    int carry=0;

    ListNode curr=dummy;

        while(head1!=null && head2!=null){

         

         int value=head1.val+head2.val+carry;

        carry=value/10;

        int actval=value%10;


            ListNode newNode = new ListNode(actval);

            curr.next=newNode;

         curr=newNode;
            
            head1=head1.next ;

            head2=head2.next;
        }



        while(head1!=null){

             int value=head1.val+carry;

              carry=value/10;

              int actval=value%10;


            ListNode newNode = new ListNode(actval);

             curr.next=newNode;
                 curr=newNode;
             head1=head1.next;

        }



     while(head2!=null){

             int value=head2.val+carry;

              carry=value/10;

              int actval=value%10;


            ListNode newNode = new ListNode(actval);

             curr.next=newNode;
                 curr=newNode;
             head2=head2.next;

        }


        if(carry>0){
  ListNode newNode = new ListNode(carry);

  curr.next=newNode;
  curr=newNode;

        }

        return dummy.next;
    }
}