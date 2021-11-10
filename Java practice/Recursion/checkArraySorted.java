public class checkArraySorted {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] arr2 = {1,2,3,4,5,6,4,1};
        System.out.println(checkSorted(arr1));
        System.out.println(checkSorted(arr2));
    }

    static boolean checkSorted(int[] array){
        return helper(array,0);
    }

    static boolean helper(int[] array,int n){

        if(array.length-1 <= n){
            return true;
        }
        if(array[n]<array[n+1] && helper(array, n+1)){
            return true;
        }

        return false;
    }
}
