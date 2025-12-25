class Solution {
    public int countSubstrings(String str) {
         if (str == null || str.length() <= 1) {
            return 1;
        }

        String LPS = "";

        int count=0;

        for (int i = 0; i < str.length(); i++) {

            //   ODD length palindrome
            int low = i;
            int high = i;
 

            while (low >= 0 && high < str.length()   && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
                count++;
            }
 
            low = i;
            high = i + 1;

            while (low >= 0 && high < str.length()  && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
                count++;
            }
 
        }

        return count;
    }
}