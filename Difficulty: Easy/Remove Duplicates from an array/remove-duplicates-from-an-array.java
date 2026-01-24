class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
         
        TreeSet<Integer> meow= new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            meow.add(arr[i]);
        }
        return new ArrayList<>(meow);
        
    }
}