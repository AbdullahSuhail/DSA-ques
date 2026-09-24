class Solution {
    public int search(int[] nums, int target) {
        
          int low=0;
        
        int high=nums.length-1; int answer=-1;
        
        while(low<=high){
            

            int mid=(low+high)/2;
            
            if(target==nums[mid])
            {
                answer=mid;
                
                break;
            }
            
            // left half of array is sorted
            if(nums[low]<=nums[mid])
            {
            
                if(nums[low]<=target  && target<=nums[mid]){
                    
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
                
            }

            // right half of array is sorted
            else{                 
                    if(nums[mid]<= target && target<=nums[high])
                    {
                        low=mid+1;
                    }
                    else
                    {
                  
                     high=mid-1;
                    }
                }
           
                
       
        }
        
        return answer;
         
    }
}