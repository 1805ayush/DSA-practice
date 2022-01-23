public class MountainArray {

    public static void main(String[] args) {
        
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        
        return orderAgnosticBS(mountainArr,target,peak+1,mountainArr.length()-1);
    }
    
    public static int orderAgnosticBS(MountainArray arr,int target,int start,int end){
       boolean isAsec = arr.get(start) <arr.get(end);
        
        while(start<end){
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }
            
            if(isAsec){
                 if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                 if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    
    public static int findPeak(MountainArray arr){
         int start =0;
        int end = arr.length()-1;
        
        while(start<end){
            int mid =start+ (end-start)/2;
            if(arr.get(mid)>arr.get(mid+1)){
                end = mid;
            }else if(arr.get(mid)<arr.get(mid+1)){
                start = mid+1;
            }
        }
        
        return start;
    }
}
