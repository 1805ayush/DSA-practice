public class reverseNumber {
    public static void main(String[] args) {
        reverse(81729);
        System.out.println();
        reverse2(12345);
    }

    static void reverse(int n){
        if(n ==0){
            return;
        }

        System.out.print(n%10);
         reverse(n/10);
    }

    static void reverse2(int n){
        int digits = (int) Math.log10(n)+1;
         System.out.println(helper(n, digits));
    }

    private static int helper(int n ,int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int) (Math.pow(10,digits-1)) + helper(n/10, digits-1); 
        
    }
}
