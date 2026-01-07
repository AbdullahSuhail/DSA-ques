/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {


   long answer;

     public int FindMax(long sumtotal,TreeNode root ){

           if(root==null){
            return 0;
           }

           int leftvalue=FindMax(sumtotal,root.left);
           int rightvalue=FindMax(sumtotal,root.right);

           long subtree1=leftvalue+rightvalue+root.val;

           long subtree2=sumtotal-subtree1;

           answer=Math.max(answer,subtree1*subtree2);

           System.out.println("The answer is "+answer);

           return (int)subtree1;

     }





    public int maxProduct(TreeNode root) {


         TreeNode head=root;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        long sumtotal=0;

        while(!q.isEmpty())
        {
          TreeNode node=q.poll();
          sumtotal=sumtotal+node.val;

            if(node.left!=null){
                q.offer(node.left);
            }

            if(node.right!=null){
                q.offer(node.right);
            }
        }

        // int answer=0;
       int res= FindMax(sumtotal,head);

        return (int) (answer % 1000000007); 
        // Findmax
        
    }
}