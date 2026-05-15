# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:


        if root is None:
            return []

        q=deque()

        answer=[]

        q.append(root)

        count=1

        # print(f"vlaue of queue is "{len(q)})

        while(len(q)>=1):

            print("Enter while")

            n=len(q)

            temp=[]

            for i in range(n):

                node=q.popleft()

                # print(f"node is {node}")

                if count%2==0:
                    temp.insert(0,node.val)

                else:
                    temp.append(node.val)
 
                if node.left is not None:
                    q.append(node.left)

                if node.right is not None:
                    q.append(node.right)

            # print(f"value of temp {temp}")


            count=count+1


            answer.append(temp)

        return answer




        