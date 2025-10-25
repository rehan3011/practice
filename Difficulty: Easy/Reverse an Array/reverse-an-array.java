class Solution {
    public void reverseArray(int arr[]) {
        int i,j=0;
        int arr1[] = new int[arr.length];
        for(i=arr.length-1; i>=0; i--){
            arr1[j]=arr[i];
            j++;
        }
        for(i=0; i<arr.length; i++){
           arr[i]=arr1[i];
        }
    }
}