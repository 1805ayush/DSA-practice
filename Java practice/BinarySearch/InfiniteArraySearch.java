public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,12,14,16,17,18};
        int target = 12;
        System.out.println(infiniteSearch(arr,target));
    }

    static int infiniteSearch(int[] arr,int target){
        //find range
        //start with box of sizze 2

        int start =0;
        int end = 1;

        //if target is less than n==> target is present in the range
        while(target >arr[end]){
            int newStart = end+1;
            end = end + (end- start + 1)*2;
            start = newStart;
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] array,int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid-1;
            }else if (target > array[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
