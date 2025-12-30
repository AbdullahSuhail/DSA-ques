class Solution {
    public boolean canJump(int[] nums) {


    int l=nums.length; int jump=1;
        for(int i=l-1 ; i>0 ; i--){

            int curr=nums[i];

            int prev=nums[i-1];

           if(prev>=jump){
            jump=1;
           }
           else{
            jump++;
           }

        }

        return jump==1?true:false;
        
    }
}