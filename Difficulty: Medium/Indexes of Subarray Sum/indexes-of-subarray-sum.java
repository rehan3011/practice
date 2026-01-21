
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> meow= new ArrayList<Integer>();
      int sum=0;
      int pre=0;
       for(int i=0; i<arr.length; i++){
           sum+=arr[i];
           while(sum>target){
               sum-=arr[pre];
               pre++;
           }
           if(sum==target){
               meow.add(pre+1);
               meow.add(i+1);
               return meow;
           }
           if(arr[i]==target){
               meow.add(i+1);
               meow.add(i+1);
               return meow;
           }
       }
       meow.add(-1);
        return meow;
    }
}
