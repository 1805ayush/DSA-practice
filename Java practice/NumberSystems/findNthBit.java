public class findNthBit {
    public static void main(String[] args){
        int i = 5;
        int n = 117;

        System.out.println(ithBit(n,i));
    }

    static int ithBit(int n,int i){
        return n&(1<<(i-1));
    }
}
