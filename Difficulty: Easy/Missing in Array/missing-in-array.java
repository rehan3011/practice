class Solution {
    int missingNum(int arr[]) {
       Arrays.sort(arr);
       int i;
       for( i=0; i<arr.length; i++){
           
           if(arr[i]!=i+1){
               return i+1;
           }
       }
       return arr.length+1;
    }
}