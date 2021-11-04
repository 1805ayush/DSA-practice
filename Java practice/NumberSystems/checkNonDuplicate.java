public class checkNonDuplicate {
    public static void main(String[] args){

        //in the array every element is present twice except one number which is present exactly one time.
        int[] arr = {2,3,4,5,1,1,2,3,5};
        System.out.println(findUnique(arr));


    }

    static int findUnique(int[] arr){
        int unique = 0;

        for (int i : arr) {
            unique ^=i;
        }
        return unique;
    }
}
