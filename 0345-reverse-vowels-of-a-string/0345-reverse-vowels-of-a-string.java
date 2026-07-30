class Solution {
    public static boolean isVowel(char ch){
        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'){
            return true;
        }
        else return false;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int l =0;
        int r = n-1;
        
        while(l<r){
            if(!isVowel(arr[l])){
                l++;
            }
               else if(!isVowel(arr[r])){
                r--;
                }
                else {
                     char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }
            }
        
        
        return new String(arr);
    }
}