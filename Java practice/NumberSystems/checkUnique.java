import java.util.ArrayList;

public class checkUnique {
    public static void main(String[] args){
        int[] arr = {2,2,3,2,7,7,8,7,8,8,2,7,8};
        
        //each number appears n times except the unique one
        int n=3;

        System.out.println(findUnique(arr,n));

    }

    static int findUnique(int[] arr,int n){
        int sumSetBits = 0;

        for (int i : arr) {
            sumSetBits = sumSetBits +Integer.parseInt(Integer.toBinaryString(i));
        }

        System.out.println(sumSetBits);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j=sumSetBits;j>0;j=j/10){
            int bit = j%10;
            list.add(bit%3);

        }
        int sum = 0; 
        for(int k=list.size()-1;k>=0;k--){
            sum=sum+ list.get(k) * ((int)Math.pow((int)Math.pow(2,k),list.get(k)));
            //System.out.println(list.get(k)+"  "+sum);
        }
        return sum;
    }
}
