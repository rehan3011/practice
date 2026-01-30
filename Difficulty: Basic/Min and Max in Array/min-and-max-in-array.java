class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> meow= new ArrayList<Integer>();
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
            max=arr[i];
        }
        
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
            min=arr[i];
        }
        meow.add(min);
        meow.add(max);
        return meow;
    }
}
