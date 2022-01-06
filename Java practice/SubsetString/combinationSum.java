import java.util.ArrayList;

public class combinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int n=7;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        System.out.println(combSum(arr, n,sum));
    }

    static ArrayList<ArrayList<Integer>> combSum(int[] candidates, int target,ArrayList<Integer> numTillNow){
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(target<=0){
            result.add(numTillNow);
            return result;
        }
        else if(target<0){
            return result;
        }

        if(target>0){
            for(int i=0;i<candidates.length && target >= candidates[i] ; i++){
                numTillNow.add(candidates[i]);
                result = combSum(candidates,target-candidates[i],numTillNow);
                numTillNow.remove(numTillNow.size()-1);
            }
        }
        return result;
    }
}
