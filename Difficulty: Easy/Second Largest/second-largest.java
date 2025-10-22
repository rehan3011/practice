class Solution {
    public int getSecondLargest(int[] arr) {
        int max=arr[0],max2;
        if(arr[0]==arr[1]&&arr[0]==arr[2])
        return -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
            max=arr[i];
        }
        if(arr[0]!=max)
        max2=arr[0];
        else
        max2=arr[1];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max2&&arr[i]!=max)
            max2=arr[i];
        }
        
        return max2;
    }
}