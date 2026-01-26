// User function Template for Java

class Solution {
    static void rotateArr(int arr[], int d) {
         d=d%arr.length;
        for(int i=0; i<d; i++){
            int temp=arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        
    }
}