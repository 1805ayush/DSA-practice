public class rangeXor {
    public static void main(String[] args) {

        int a=3;
        int b=9;
        System.out.println(xor(b)^xor(a-1));
    }

    static int xor(int a){
        if(a%4 ==0){
            return a;
        }
        else if(a%4 ==1){
            return 1;
        }
        else if(a%4 ==2){
            return a+1;
        }

        return 0;
    }
}
