class Solution {
    int majorityElement(int arr[]) {
    
    int count =0;
    int sequence=0;
    
    for(int i=0; i<arr.length; i++){
        if(count==0){
        sequence=arr[i];
        count=1;
        }
        else if(arr[i]==sequence)
        count++;
        else
        count--;
    }
        count =0;
        
        for(int j=0; j<arr.length; j++){
            if(arr[j]==sequence)
            count++;
        }
        
        if(count>arr.length/2)
        return sequence;
        else
        return -1;
    }
}