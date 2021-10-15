public class BinarySearch {
    public static void main(String[] args){
        int[] a = {2,5,6,12,13,20,121,777};
        System.out.println(binSearch(a, 45, 0, a.length-1));

    }

    static int binSearch(int[] arr,int target,int start,int end){

        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }else if(target>arr[mid]){
            start  =mid+1;
            return binSearch(arr,target,start,end);
        }else if(target<arr[mid]){
            end = mid-1;
            return binSearch(arr,target,start,end);
        } 

        return -1;

    }
}
