import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {7,1,4,9,3,2};
        // sortedArr = mergeSort(arr);
        // System.out.println(Arrays.toString(sortedArr));
        mergeSortinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[] arr){
        if (arr.length==1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }
    static void mergeSortinplace(int[] arr,int start, int end){
        if (end-start==1) {
            return;
        }

        int mid = (start+end)/2;

        // int[] left = mergeSort(Arrays.copyOfRange(arr, 0,mid));
        // int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        mergeSortinplace(arr, start, mid);
        mergeSortinplace(arr, mid,end);

        mergeinplace(arr,start,mid,end);
    }
    static void mergeinplace(int[] arr,int start,int mid,int end){
        int[] mix = new int[end-start];

        int i = start;
        int j=mid;
        int k=0;

        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        } 
        while(j<end){
            mix[k]=arr[j];;
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }

    static int[] merge(int[] first, int[] second){
        int[] result = new int[first.length + second.length];

        int i = 0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                result[k]=first[i];
                i++;
            }else{
                result[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            result[k]=first[i];
            i++;
            k++;
        } 
        while(j<second.length){
            result[k]=second[j];;
            j++;
            k++;
        }

        return result;
    }
}
