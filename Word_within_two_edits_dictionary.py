class Solution:
    def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
        

        answer=[]

        for ch in queries:
            original=ch

            # c1=Counter(original)
            # print(f" queries of {original}")

            for bh in dictionary:

                wordofdic=bh
                # print(f" dictionary {wordofdic}")


                count=0
                for i in range(len(wordofdic)):

# 
                    # print(f"Matching the vlaue {wordofdic[i]} to value of {original[i]}")

                    if wordofdic[i]!=original[i]:
                        count=count+1

                    
                    if count>2:
                        break

                

                if count<=2:

                    # print(f"{original} was found to match is {wordofdic} with count of {count}")
                    # if original not in answer:
                    answer.append(original)
                    break
 





        return answer
           # sortedwordofdic="".join(sorted(wordofdic))


        