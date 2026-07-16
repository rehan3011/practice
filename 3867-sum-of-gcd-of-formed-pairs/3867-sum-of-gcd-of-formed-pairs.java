class Solution {
    public int gcd(int x, int y){
        if(y==0){
            return x;
        }

        return gcd(y, x%y);
    }
    public long gcdSum(int[] nums) {

        int arr[] = new int[nums.length];
        int max = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max= nums[i];
            }
            int gcd = gcd(nums[i], max);
            arr[i] = gcd;

        }
        Arrays.sort(arr);
        int left =0;
        int right = nums.length-1;
        long sum =0;
        while(left<right){
            sum+=gcd(arr[left],arr[right]);
            left++;
            right--;
        }
        return sum;
    }
}