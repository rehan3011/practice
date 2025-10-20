import java.util.*;
public class array7 {
    public static void main(String[] args){
       int[] arr={1,7,2,9,4};
       Arrays.sort(arr);
       for(int i=0; i<5; i++){
        System.out.println(arr[i]);
       }

       ArrayList<Integer> list= new ArrayList<>();
       list.add(10);
       list.add(90);
       list.add(30);
       Collections.sort(list);
       System.out.println(list);

    }
}
