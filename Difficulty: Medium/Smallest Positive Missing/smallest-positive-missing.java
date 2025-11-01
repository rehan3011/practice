class Solution {
    public int missingNumber(int[] arr) {
        
        HashSet <Integer> meow = new HashSet<>();
        int n=arr.length;
        int i;
        for(i=0; i<n; i++){
            if(arr[i]>=0){
                meow.add(arr[i]);
            }
        }
        ArrayList<Integer> meow1 = new ArrayList<Integer>(meow);
        Collections.sort(meow1);
        for( i=0; i<meow1.size(); i++){
            if(meow1.get(0)>1)
            return 1;
            if(i==meow1.size()-1)
            return meow1.get(i)+1;
            if(meow1.get(i+1)!=meow1.get(i)+1){
                return meow1.get(i)+1;
            }
        }
        return 1;
    }
}
