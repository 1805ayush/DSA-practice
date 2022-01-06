import java.net.Inet4Address;
import java.util.ArrayList;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums ={1,1,1,1,1};
        int target = 3;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        System.out.println(targetSum(nums, sum, target));
    }

    static int targetSum(int[] arr, ArrayList<Integer> sumTillNow, int target) {
        
        if(arr.length==0){
            int sum = 0;
            for (int i : sumTillNow) {
                sum+=i;
            }
            if(sum==target){
                return 1;
            }else{
                return 0;
            }
          //  return 1;
        }

        int count = 0;

        int[] newArr = new int[arr.length-1];
        for(int i=0; i<arr.length-1;i++){
            newArr[i] = arr[i+1];
        }

        int curr = arr[0];

        sumTillNow.add(curr);
        count+=targetSum(newArr,sumTillNow,target);
        sumTillNow.remove(sumTillNow.size()-1);

        sumTillNow.add(0-curr);
        count+=targetSum(newArr,sumTillNow,target);
        sumTillNow.remove(sumTillNow.size()-1);

        return count;

    }
}
