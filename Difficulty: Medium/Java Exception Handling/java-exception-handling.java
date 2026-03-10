// User function Template for Java

class Solution {
    
    public int findMin(int a, int b) {
        
       
       try{
           int k=a+b;
           int l=a-b;
           int m=a*b;
           int n=a/b;
           int min1= Math.min(k,l);
           int min2=Math.min(m,n);
           int min3=Math.min(min1,min2);
           return min3;
       }
       catch(ArithmeticException e){
           return 0;
       }
       
    }
}