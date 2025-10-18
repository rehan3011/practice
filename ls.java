import java.util.*;
public class ls {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the key value: ");
        int key= sc.nextInt();
        for(i=0; i<n; i++){
        if(arr[i]==key){
            System.out.printf("element is found in the index %d ",i);
            System.exit(0);
        }
    }
    System.out.println("not found sorry!!!!");
}
}
