// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        int sum=0; int answer=0;
        
        for(int i=0 ; i<arr.length;i++){
            
            sum+=arr[i];
            
            int req=sum-k;
            
            if(sum==k){
                answer=Math.max(answer,i-0+1);
            }
            
            
            if(mp.containsKey(req)){
                
                answer=Math.max(answer,i-mp.get(req));
            }
          
          
          
          if(mp.containsKey(sum)){
              continue;
          }
          else{
              mp.put(sum,i);
          }
            
        }
        
        return answer;
        
        
        
        
        
        
 
        
        
        
        
    }
}
