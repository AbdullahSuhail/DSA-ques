class Solution {
    public int maxArea(int[] height) {
        

        int left=0;
        int right=height.length-1;

        int answer=0;

        while(left<=right  && left >=0 && right<height.length){


       int len=right-left;
       int h=Math.min(height[left],height[right]);

       int water=h*len;

       answer=Math.max(answer,water);

       if(height[left]<=height[right]){
        left++;
       }
       else{
        right--;
       }

            
        }

        return answer;

    }
}