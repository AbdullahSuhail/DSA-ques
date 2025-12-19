
class Main {
    
    
    public static void wordtonumber(String word[],String number,int l,int i)
    {
        if(i==l){
            return;
        }
               
        System.out.println(word[ (number.charAt(i))-'0' ]);
        
        wordtonumber(word,number, l,i+1);
      
    }
    
   
    
    public static void main(String[] args) 
    {

    String word[]={"zero","one ","two","three","four","five","six","seven","eight","nine"};     
      
      String number="2022";
      
      int l=number.length();
      
      wordtonumber(word,number,l,0);
   
    }
}