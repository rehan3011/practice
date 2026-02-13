class Solution {
    public String longestPalindrome(String s) {
      if(s==null||s.length()<1)
      return "";

    String longest="";
    for(int i=0; i<s.length(); i++){
        int left=i;
        int right=i;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        String odd=s.substring(left+1,right);
        left=i;
        right=i+1;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        String even=s.substring(left+1,right);

        if(odd.length()>longest.length())
        longest=odd;
        if(even.length()>longest.length())
        longest=even;
    }
    return longest;
    }
}
