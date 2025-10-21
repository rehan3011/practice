
class Solution {
    public String average(int arr[]) {
        double sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        double avg= sum/arr.length;
        String av= String.format("%.2f",avg );
        return av;
        
    }
}