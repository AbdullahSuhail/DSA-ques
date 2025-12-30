class Solution {
    public int[][] merge(int[][] intervals) {



         int rows=intervals.length;

         int cols=intervals[0].length; 


         Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
 

      List<List<Integer>> list = new ArrayList<>();

         int prevx = intervals[0][0]; int prevy=intervals[0][1];
 
        for(int i=1 ; i<rows ; i++){

            int currx=intervals[i][0];
            int curry=intervals[i][1];
            if(currx<= prevy){

            prevy=Math.max(prevy,curry);

            }
            else{
                    List<Integer> temp=new ArrayList<>();


               temp.add(prevx); temp.add(prevy);
              list.add(temp);

              
                prevx=currx;
                prevy=curry;

            }

        }
            List<Integer> temp=new ArrayList<>();
              temp.add(prevx); temp.add(prevy);
              list.add(temp);

              System.out.println(list);

        int newrows = list.size();
        int newcols = list.get(0).size();

        int[][] arr = new int[newrows][newcols];

        for (int i = 0; i < newrows; i++) {
            for (int j = 0; j < newcols; j++) {
                arr[i][j] = list.get(i).get(j);
            }
        }


 
        return arr;
        
    }
}