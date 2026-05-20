
        if root is None:
            return []

        q=deque()

        q.append(root)

        answer=[]

        while len(q)>=1:

            size=len(q)

            temp=[]

            for i in range(size):

                node=q.popleft()
                temp.append(node.val)

                if node.left is not None:
                    q.append(node.left)

                if node.right is not None:
                    q.append(node.right)

            answer.append(temp)

        return answer
        