


'''TOPIC 
Array
Hash Table
Math
Weekly Contest 478'''

class Solution:
    def minMirrorPairDistance(self, nums: List[int]) -> int:

        l=len(nums)

        # original={}

        reversemap={}

        answer=float('inf')

 
        for i in range(0,l):

             
            reversenum = int(str(nums[i])[::-1])

            if nums[i] in reversemap:

                foundidx=reversemap[nums[i]]

                temp=abs(foundidx-i)

                answer=min(temp,answer)

            else:

                pass

            
            reversemap[reversenum]=i


        if answer==float('inf'):

            answer=-1


        return answer





        






        