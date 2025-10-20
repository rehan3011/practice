import java.util.*;

public class array6 {
    public static void main(String[] args){
        Scanner meow = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println("Enter the number of elements to be added into array: ");
        int n=meow.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            list.add(meow.nextInt());
        }
        System.out.println("Enter the key: ");
        int key=meow.nextInt();

        //Linear Search
        System.out.println("Using Linear Search!!: ");

        if(list.contains(key))
        System.out.println("Key found At index: "+list.indexOf(key));
        else
        System.out.println("Element not found!!!");

        //Binary Search
        System.out.println("Using Binary Search!!: ");

        int index=Collections.binarySearch(list,key);
        if(index>=0)
        System.out.println("Element found at index: "+index);
        else
        System.out.println("Element is not found!!");

    }
}
