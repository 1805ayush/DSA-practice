public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,12,14,16,17,18};
        int target = 15;
        System.out.println(getFloor(arr,target));
    }

    public static int getFloor(int[] arr, int target){

        int start = 0;
        int end =arr.length - 1;

        while(end >= start){
            int  mid = start +  (end-start)/2;

            if(arr[mid] < target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                return mid;
            }
        }

        return arr[end];
    }
}
