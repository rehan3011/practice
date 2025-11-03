public class sorting1and0 {
    public static void main(String[] args){
        int arr[]={0,1,2,0,1,2};
        int c=0,i=0,c2=0;
        for(i=0; i<arr.length; i++){
            if(arr[i]==2)
            c2++;
            if(arr[i]==1)
            c++;
            if(arr[i]!=0){
                arr[i]=0;
            }

        }
        while(c<arr.length-c2){
            arr[c++]=1;
        }
        int c3=arr.length-c2;
        while(c3<arr.length){
            arr[c3++]=2;
        }
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
