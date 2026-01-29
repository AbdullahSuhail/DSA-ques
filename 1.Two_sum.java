class Solution {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> st=new HashMap<>();


        int answer[]=new int[2];

        for(int i=0 ; i< nums.length ;i++){

              
           int ele=nums[i];

           int req=target-ele;

           if(st.containsKey(req)){

            answer[0]=i;
            answer[1]=st.get(req);

            break;
           }
           else{
            st.put(ele,i);
           }
        }
        return answer;  
    }
}