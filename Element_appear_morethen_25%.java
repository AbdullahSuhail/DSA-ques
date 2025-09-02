class Solution {
    public int findSpecialInteger(int[] arr) {


        

        int len=arr.length;

        if(len==1) return arr[0];

        int hitcount=len/4;
        System.out.println(hitcount);

        int prev=arr[0];
        int currcount=1;
        for(int i=1;i<len;i++){


            if(arr[i]==prev){
                currcount++;

                if(currcount>hitcount) return arr[i];
            }
            else{

                prev=arr[i];
                currcount=1;
            }

        }

        return 0;
        
    }
}