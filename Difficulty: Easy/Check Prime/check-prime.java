class Solution {
    public static boolean prime(int n) {
        if(n==1)
        return false;
        if(n==2)
            return true;
            if(n<=0)
            return false;
        for(int i=n-1; i>1; i--){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
}