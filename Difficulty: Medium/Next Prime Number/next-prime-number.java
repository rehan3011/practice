// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        int i,j;
        int flag;
        
        for(i=n+1; i<500; i++){
            flag=1;
            for(j=2; j<i; j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                return i;
            }
        }
        return -1;
    }
}