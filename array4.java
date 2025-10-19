import java.util.*;
public class array4 {
    public static void main(String[] args){
        int i;
        Scanner meow = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=meow.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++){
            arr[i]=meow.nextInt();
        }
        System.out.println("the alternatives of the elements are: ");
        for(i=0; i<n; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
