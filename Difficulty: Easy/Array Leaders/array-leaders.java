class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
      ArrayList<Integer> arr1=new ArrayList<Integer>();
      int maxFromRight=arr[arr.length-1];
      arr1.add(maxFromRight);
      for(int i=arr.length-2; i>=0; i--){
          
          if(arr[i]>=maxFromRight){
              maxFromRight=arr[i];
      arr1.add(maxFromRight);
              
          }

      }
      Collections.reverse(arr1);
      return arr1;
    }
}
