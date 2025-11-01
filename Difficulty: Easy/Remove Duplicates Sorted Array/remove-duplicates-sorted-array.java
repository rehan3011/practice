class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> meow = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            meow.add(arr[i]);
        }
        ArrayList<Integer> meow1= new ArrayList<>(meow);
        return meow1;
    }
}
