class Solution {
    public int[] dailyTemperatures(int[] temperatures) {


        Stack<Integer> st=new Stack<>();

        int l=temperatures.length;

        int answer[]=new int[l];

        st.push(l-1);

        answer[l-1]=0;

        for(int i=l-2;i>=0;i--){


            while(!st.isEmpty() && temperatures[i]>= temperatures[st.peek()]){
              
              st.pop();
            }

            if(!st.isEmpty()){
                answer[i]=st.peek()-i;
            }

            // int j=st.peek();          
            // if(temperatures[j]>temperatures[i]){
            //       answer[i]=j-i;
            //       st.push(i);
            // }
            // else{
            //    while( st.size()!=0 && temperatures[st.peek()]<=temperatures[i]){
            //     st.pop();
            
            //    }
            //    if(st.size()==0){
            //     answer[i]=0;
            //    }
            //    else{  
            //     int j1=st.peek();
            //     answer[i]=j1-i;
            //    }
          st.push(i);
 

            
        }
        

        return answer;
    }
}