class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l=nums.length;
        int minarray[]=new int[l];
        int maxarray[]=new int[l];

 
        int smallest=nums[l-1];

        for(int i=l-1;i>=0;i--){

            if(nums[i]<smallest){
                smallest=nums[i];
                minarray[i]=smallest;
            }
            else{
                minarray[i]=smallest;
            }
        }

        // maxvalues
        int largest =nums[0];
        for(int i=0;i<l;i++)
        {
            if(nums[i]>largest){
                largest=nums[i];
                maxarray[i]=largest;
            }
            else{
                maxarray[i]=largest;
            }       
        }


            // for(int i=0;i<l;i++){
            // System.out.print(minarray[i]);
            // }

            // System.out.println(" ");

            // for(int i=0;i<l;i++){
            // System.out.print(maxarray[i]);
            // }

            // System.out.println(" ");


        int answer=Integer.MAX_VALUE; int index=Integer.MAX_VALUE;

        for(int i=0;i<l;i++){
             int ele=nums[i];

             int maxside=maxarray[i];
             int minside=minarray[i];

            //  System.out.println("The ele is "+ele+" at index of "+i);

            //  System.out.println("The max value is "+maxside);
            //  System.out.println("The min value is "+minside);

             int diff=maxside-minside;

            // System.out.println("The diff value is "+diff);


             if((diff)<=k){

                if(diff<answer){
                    answer=diff;
                   index=Math.min(index,i);
                }

             }




        }

        return (index==Integer.MAX_VALUE)?-1:index;

    }
}