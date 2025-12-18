class Solution {
    public int longestConsecutive(int[] nums) {



           Arrays.sort(nums);

          if(nums.length==0 || nums.length==1) return nums.length;

    // if(nums.len)
            int prev=nums[0];

            int count=1; int answer=1;
            for(int i=1; i<nums.length;i++)
            {
            int ele=nums[i];


            if(ele==prev) continue;
           if(ele==prev+1){
            count++;
            prev=ele;
           }
           else{
            prev=ele;
            count=1;
           }


           answer=Math.max(answer,count);


        }


        return answer;
        
    }
}