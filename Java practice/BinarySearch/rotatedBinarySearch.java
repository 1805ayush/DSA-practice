public class rotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,6));
    }
    public static int search(int[] nums, int target) {
        if(nums.length ==1){
            if(target==nums[0])
                return 0;
            else
                return -1;
        }
        int pivot = findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        int firstTry = binarySearch(nums,target,0,pivot);
        if(firstTry!=-1){
            return firstTry;
        }
        
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    
    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(nums[start]>=nums[mid]){
                end = mid-1;
            }else if(nums[start]<nums[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] nums,int target,int start,int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                return mid;
            }
        }
        
        return -1;
    }

    public static int findPivotWithDuplicates(int[] nums){
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            //if elements at start,mid and end are equal then skip the duplicates
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

            //left side is sorted ==> pivot is in right side
            else if(nums[start]< nums[mid]||(nums[start]==nums[mid] && nums[mid]>nums[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
