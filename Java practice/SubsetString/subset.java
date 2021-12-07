import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = subSet(arr);
        // for(ArrayList<Integer> list: ans){
        //     System.out.println(list);
        // }
        int[] arr2={1,2,2};
        ArrayList<ArrayList<Integer>> ans2 = subSetDuplicate(arr2);
        for(ArrayList<Integer> list2: ans2){
            System.out.println(list2);
        }

    }

    static ArrayList<ArrayList<Integer>> subSet(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<Integer>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static ArrayList<ArrayList<Integer>> subSetDuplicate(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        outer.add(new ArrayList<>());
        int start = 0;
        int end =0;

        for (int i=0;i<arr.length;i++) {
            start = 0;
            //if current and previous element are same then s=e+1

            if(i>0 &&arr[i-1]==arr[i]){
                start = end+1;
            }

            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<Integer>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
