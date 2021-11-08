public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDig(1234));
    }

    static int sumOfDig(int n){
        if(n/10>0){
            return (n%10) + sumOfDig(n/10);
        }

        return n;
    }
}
