class Solution {
    public int minimumSwaps(int[] arr) {
        int right = arr.length-1;
        int left = 0;
        int count = 0;

        while(left<=right){
            if(arr[right]==0){
                right--;
                continue;
            }
            if(arr[left]==0){
                arr[left] = arr[right];
                arr[right] = 0;
                right--;
                count++;
            }
            left++;
        }
        return count;
    }
}