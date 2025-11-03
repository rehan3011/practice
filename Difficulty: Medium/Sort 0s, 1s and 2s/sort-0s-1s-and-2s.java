class Solution {
    public void sort012(int[] arr) {
        int c=0,i=0,c2=0;
        for(i=0; i<arr.length; i++){
            if(arr[i]==2)
            c2++;
            if(arr[i]==0)
            c++;
            if(arr[i]!=0){
                arr[i]=0;
            }

        }
        while(c<arr.length-c2){
            arr[c++]=1;
        }
        int c3=arr.length-c2;
        while(c3<arr.length){
            arr[c3++]=2;
        }
    }
}