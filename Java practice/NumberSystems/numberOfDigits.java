public class numberOfDigits {
    public static void main(String[] args){
        System.out.println(findDigits(6, 2));
    }

    static int findDigits(int num,int base){
        int digit = (int)(Math.log(num)/Math.log(base)) + 1;

        return digit;
    }
}
