class Solution {
    public int findKRotation(int arr[]) {
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
       if(max==arr[arr.length-1]){
            return 0;
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j]==max){
                return j+1;
                
            }
        }
        return 0;
        
    }
}