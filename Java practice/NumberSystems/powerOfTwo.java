public class powerOfTwo {
    public static void main(String[] args){

        int n =16;
        boolean result = (n&(n-1))== 0;
        System.out.println(n+" is a power of 2: "+ result);
    }
}
