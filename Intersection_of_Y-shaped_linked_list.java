// You are given the heads of two non-empty singly linked lists, head1 and head2, that intersect at a certain point. Return that Node where these two linked lists intersect.

// Note: It is guaranteed that the intersected node always exists.

// In the custom input you have to give input for CommonList which pointed at the end of both head1 and head2 to form a Y-shaped linked list.


// ----------------------------------------------------------------






class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
                     
        HashSet<Node> st=new HashSet<>();
        
        Node temp1=head1;
        while(temp1 !=null){
            
            temp1=temp1.next;
            
            st.add(temp1);
        }
        
        
        Node temp2=head2;
        
        while(temp2!=null){
            
            if(st.contains(temp2)){
                
                break;
                // return temp2;
            }
            
            temp2=temp2.next;
            
            
        }
        
        return temp2;
        
    }
}