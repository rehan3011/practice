class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> meow = new <Character> HashSet();
        int j=0; int max=0;
        for(int i=0; i<s.length(); i++){
            while(meow.contains(s.charAt(i))){
            meow.remove(s.charAt(j));
            j++;
            }
                meow.add(s.charAt(i));
                max=Math.max(max,i-j+1);
        }
        return max;
    }
}