class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
       HashSet <Integer> meow1 = new HashSet<>();
       for(int i=0; i<a.length; i++){
           meow1.add(a[i]);
       }
       for(int j=0; j<b.length; j++){
        meow1.add(b[j]);

       }
      ArrayList<Integer> meow= new ArrayList<>(meow1);
        return meow;
    }
}