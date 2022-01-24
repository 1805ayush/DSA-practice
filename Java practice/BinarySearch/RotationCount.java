public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rotationCount(arr));
    }

    public static int rotationCount(int[] nums) {
        int pivot = findPivot(nums);
        return pivot+1;
        
    }

    public static int findPivot(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>start && nums[mid-1]>nums[mid]){
                return mid-1;
            }

            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                //check if startis pivot element
                if((start+1)<end && nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if((end-1)>start && nums[end]<nums[end-1] ){
                    return end-1;
                }
                end--;
            }

            else if(nums[start]< nums[mid]||(nums[start]==nums[mid] && nums[mid]>nums[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}
