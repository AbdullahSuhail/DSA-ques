// Delete keys in a Linked list
 
// Given a single linked list and an integer x.
//  Your task is to complete the function deleteAllOccurances() which deletes all occurences of a key x present in the linked list. 
// The function takes two arguments: the head of the linked list and an integer x.
//  The function should returns the head of the modified linked list.




class GfG {
    public static Node deleteAllOccurances(Node head, int x) {
        // Your code here
           
        Node dummy=new Node(-1);
        
        Node answer=dummy;
        
        Node curr=head;
               
        while(curr!=null)
        {
            
            if(curr.data==x){
                curr=curr.next;
            }
            else{
                
                
                
                dummy.next=curr;
                
                dummy=curr;
                
                curr=curr.next;
            }        
            
        }
             
        dummy.next=null;        
        
        return answer.next;
        
    }
}