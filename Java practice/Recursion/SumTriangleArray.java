import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sum(arr);

    }

    static void sum(int[] arr){
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] newArr = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            newArr[i] = arr[i]+arr[i+1];
        }

        sum(newArr);
        System.out.println(Arrays.toString(arr));
    }
}
