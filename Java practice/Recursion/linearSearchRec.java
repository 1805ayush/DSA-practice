import java.util.*;
import java.util.ArrayList;

public class linearSearchRec {
    public static void main(String[] args) {
        int[] a = {2,5,6,12,13,20,121,13,777};
        int target = 13;
        System.out.println(search(a,target,0));
        int target2=10;
        System.out.println(search(a,target2,0));
        allIndices(a, target, 0);
        System.out.println(list);

        ArrayList<Integer> indices = new ArrayList<Integer>();
        System.out.println(allIndicesList(a, target, 0,indices));

        System.out.println(allIndicesList2(a, target, 0));
    }

    static boolean search(int[] arr, int target,int i){
        if(arr.length-1<=i){
            return false;
        }
    
        return (arr[i]==target || search(arr, target,i+1));
    }
    static ArrayList<Integer> list = new ArrayList<Integer>();

    static void allIndices(int[] arr, int target,int i){
        if(arr.length-1<=i){
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }
            allIndices(arr, target, i+1);
        
    }

    static ArrayList<Integer> allIndicesList(int[] arr, int target,int i, ArrayList<Integer> result){
        if(arr.length-1<=i){
            return result;
        }
        if(arr[i]==target){
            result.add(i);
        }
            return allIndicesList(arr, target, i+1, result);
        
    }

    static ArrayList<Integer> allIndicesList2(int[] arr, int target,int i){

        ArrayList<Integer> result = new ArrayList<Integer>();

        if(arr.length-1<=i){
            return result;
        }
        if(arr[i]==target){
            result.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls= allIndicesList2(arr, target, i+1);
        
        result.addAll(ansFromBelowCalls);

        return result;
    }
}
