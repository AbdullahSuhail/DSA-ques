// 904. Fruit Into Baskets


// You are visiting a farm that has a single row of fruit trees arranged from left to right.
// The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// Given the integer array fruits, return the maximum number of fruits you can pick


class Solution {
    public int totalFruit(int[] fruits) {
        

    HashMap<Integer,Integer> st=new HashMap<>();

    int max=Integer.MIN_VALUE;

    int left=0;

    for(int right=0;right<fruits.length;right++){

                   
            if (st.containsKey(fruits[right])) {
               st.put(fruits[right], st.get(fruits[right]) + 1);
            } else {
                st.put(fruits[right], 1);
            }


          while(st.size()>2){

            int ele=fruits[left];

            int freq=st.get(ele);

            freq--;

            if(freq==0){
                st.remove(ele);
            }
            else{
                st.put(ele,freq);
            }
            
            left++;

          }
          max=Math.max(max,right-left+1);


    }

    return max;



    }
}