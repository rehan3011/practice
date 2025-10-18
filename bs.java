import java.util.*;
public class bs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key value: ");
        int key=sc.nextInt();
        int low=0;
        int high=n-1;
        int mid;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==key){
                System.out.println("Element is found at: "+mid);
                System.exit(0);
            }
            else if(key>arr[mid])
            low=mid+1;
            else
            high=mid-1;
        }
        System.out.println("not found sorry!!");
    }
}
