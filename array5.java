import java.util.*;
public class array5{
    public static void main(String[] args){
        int i,a=0,d=0;
        Scanner meow= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=meow.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++){
            arr[i]=meow.nextInt();
        }
        for(i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                d++;
            }
            else{
                a++;
            }
        }
        if(a+1==n)
        System.out.println("Array is sorted in Ascending order!!");
        else if(d+1==n)
        System.out.println("Array is sorted in Desending order!!");
        else
        System.out.println("Array is not sorted!!");
        meow.close();
    }
}