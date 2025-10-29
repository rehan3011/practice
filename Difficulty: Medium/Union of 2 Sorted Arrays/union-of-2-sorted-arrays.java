class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n=a.length,m=b.length;
     HashSet <Integer> meow = new HashSet<>();
        for(int i=0; i<n; i++){
            meow.add(a[i]);
        }
        for(int j=0; j<m; j++){
            meow.add(b[j]);
        }
        ArrayList <Integer> meow1 = new ArrayList<>(meow);
        meow1.sort(null);        
        return meow1;
    }
}
