// Insert in Sorted way in a Sorted DLL
 
// Given a sorted doubly linked list and an element x, you need to insert the element x into the correct position in the sorted Doubly linked list(DLL).

// Note: The DLL is sorted in ascending order





class Solution {
    public Node sortedInsert(Node head, int x) {
       
        
        
        Node curr=head;
        
        Node prevs=null;
        
        if(x<head.data){
            
            Node newnode=new Node(x);
            
            newnode.next=head;
            head.prev=newnode;
            
            return newnode;
        }
        
        
        while(curr!=null && curr.data<=x   )
        {
            
            prevs=curr;
            
            curr=curr.next;
            
            
        }
        
        Node newnode=new Node(x);
        
        
        if(curr==null){
            
            prevs.next=newnode;
            newnode.prev=prevs;
            
        }
        else{
            
        
        
            prevs.next=newnode;
            
            newnode.prev=prevs;
            
            newnode.next=curr;
            curr.prev=newnode;
        }
        
        
        
        
        return head;
        
        
    }
}